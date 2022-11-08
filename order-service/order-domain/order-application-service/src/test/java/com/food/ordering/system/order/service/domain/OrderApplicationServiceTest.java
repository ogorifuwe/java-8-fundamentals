package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.domain.valueobject.*;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.create.OrderAddress;
//import com.food.ordering.system.order.service.domain.entity.OrderItem;
import com.food.ordering.system.order.service.domain.dto.create.OrderItem;
import com.food.ordering.system.order.service.domain.entity.Customer;
import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.Product;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.exception.OrderDomainException;
import com.food.ordering.system.order.service.domain.mapper.OrderDataMapper;
import com.food.ordering.system.order.service.domain.ports.input.service.OrderApplicationService;
import com.food.ordering.system.order.service.domain.ports.output.repository.CustomerRepository;
import com.food.ordering.system.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.system.order.service.domain.ports.output.repository.RestaurantRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = OrderTestConfiguration.class)
public class OrderApplicationServiceTest {

  @Autowired
  private OrderApplicationService orderApplicationService;

  @Autowired
  private OrderDataMapper orderDataMapper;

  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private CustomerRepository customerRepository;

  @Autowired
  private RestaurantRepository restaurantRepository;

  private CreateOrderCommand createOrderCommand;
  private CreateOrderCommand createOrderCommandWrongPrice;
  private CreateOrderCommand createOrderCommandWrongProductPrice;
  private final UUID CUSTOMER_ID = UUID.fromString("b08cde42-71e9-44a8-824f-826e0a0de600");
  private final UUID RESTAURANT_ID = UUID.fromString("10f575d1-d312-46ed-8bec-de322c0a5dbb");
  private final UUID PRODUCT_ID = UUID.fromString("6db2824a-e47b-412e-adf4-b9b0939e2850");
  private final UUID ORDER_ID = UUID.fromString("190a39ae-3830-4b37-8944-408a596e684b");
  private final BigDecimal PRICE = new BigDecimal("200.00");

  @BeforeAll
  public void init() {
    createOrderCommand = CreateOrderCommand.builder()
            .customerId(CUSTOMER_ID)
            .restaurantId(RESTAURANT_ID)
            .address(OrderAddress.builder()
                    .street("street 1")
                    .postalCode("60601")
                    .city("Chicago")
                    .build())
            .price(PRICE)
            .items(List.of(OrderItem.builder()
                            .productId(PRODUCT_ID)
                            .quantity(1)
                            .price(new BigDecimal("50.00"))
                            .subTotal(new BigDecimal("50.00"))
                            .build(),
                    OrderItem.builder()
                            .productId(PRODUCT_ID)
                            .quantity(3)
                            .price(new BigDecimal("50.00"))
                            .subTotal(new BigDecimal("150.00"))
                            .build()))
            .build();

    createOrderCommandWrongPrice = CreateOrderCommand.builder()
            .customerId(CUSTOMER_ID)
            .restaurantId(RESTAURANT_ID)
            .address(OrderAddress.builder()
                    .street("street 1")
                    .postalCode("60601")
                    .city("Chicago")
                    .build())
            .price(new BigDecimal("250.00"))
            .items(List.of(OrderItem.builder()
                            .productId(PRODUCT_ID)
                            .quantity(1)
                            .price(new BigDecimal("50.00"))
                            .subTotal(new BigDecimal("50.00"))
                            .build(),
                    OrderItem.builder()
                            .productId(PRODUCT_ID)
                            .quantity(3)
                            .price(new BigDecimal("50.00"))
                            .subTotal(new BigDecimal("150.00"))
                            .build()))
            .build();

    createOrderCommandWrongProductPrice = CreateOrderCommand.builder()
            .customerId(CUSTOMER_ID)
            .restaurantId(RESTAURANT_ID)
            .address(OrderAddress.builder()
                    .street("street 1")
                    .postalCode("60601")
                    .city("Chicago")
                    .build())
            .price(new BigDecimal("210.00"))
            .items(List.of(OrderItem.builder()
                            .productId(PRODUCT_ID)
                            .quantity(1)
                            .price(new BigDecimal("60.00"))
                            .subTotal(new BigDecimal("60.00"))
                            .build(),
                    OrderItem.builder()
                            .productId(PRODUCT_ID)
                            .quantity(3)
                            .price(new BigDecimal("50.00"))
                            .subTotal(new BigDecimal("150.00"))
                            .build()))
            .build();

    Customer customer = new Customer();
    customer.setId(new CustomerId(CUSTOMER_ID));

    Restaurant restaurantResponse = Restaurant.builder()
            .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
            .products(List.of(
                    new Product(new ProductId(PRODUCT_ID), "Product-1", new Money(new BigDecimal("50.00"))),
                    new Product(new ProductId(PRODUCT_ID), "Product-2", new Money(new BigDecimal("50.00")))))
            .active(true)
            .build();

    Order order = orderDataMapper.createOrderCommandToOrder(createOrderCommand);
    order.setId(new OrderId(ORDER_ID));

    when(customerRepository.findCustomer(CUSTOMER_ID)).thenReturn(Optional.of(customer));
    when(restaurantRepository.findRestaurantInformation(orderDataMapper.createOrderCommandToRestaurant(createOrderCommand)))
            .thenReturn(Optional.of(restaurantResponse));
    when(orderRepository.save(any(Order.class))).thenReturn(order);
  }

  @Test
  public void testCreateOrder() {
    CreateOrderResponse createOrderResponse = orderApplicationService.createOrder(createOrderCommand);
    assertEquals(OrderStatus.PENDING, createOrderResponse.getOrderStatus());
    assertEquals("Order Created Successfully", createOrderResponse.getMessage());
    assertNotNull(createOrderResponse.getOrderTrackingId());
  }

  @Test
  public void testCreateOrderWithWrongTotalPrice() {
    OrderDomainException orderDomainException = assertThrows(OrderDomainException.class,
            () -> orderApplicationService.createOrder(createOrderCommandWrongPrice));
    assertEquals("Total price: 250.00 is not equal to Order items total: 200.00!",
            orderDomainException.getMessage());
  }

  @Test
  public void testCreateOrderWithWrongProductPrice() {
    OrderDomainException orderDomainException = assertThrows(OrderDomainException.class,
            () -> orderApplicationService.createOrder(createOrderCommandWrongProductPrice));
    assertEquals("Order item price: 60.00 is not valid for product " + PRODUCT_ID,
          orderDomainException.getMessage());
  }

  @Test
  public void testCreateOrderWithPassiveRestaurant() {
    Restaurant restaurantResponse = Restaurant.builder()
            .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
            .products(List.of(
                    new Product(new ProductId(PRODUCT_ID), "Product-1", new Money(new BigDecimal("50.00"))),
                    new Product(new ProductId(PRODUCT_ID), "Product-2", new Money(new BigDecimal("50.00")))))
            .active(false)
            .build();
    when(restaurantRepository
            .findRestaurantInformation(orderDataMapper.createOrderCommandToRestaurant(createOrderCommand)))
            .thenReturn(Optional.of(restaurantResponse));
    OrderDomainException orderDomainException = assertThrows(OrderDomainException.class,
            () -> orderApplicationService.createOrder(createOrderCommand));
    assertEquals("Restaurant with id " + RESTAURANT_ID + " is not active currently!",
            orderDomainException.getMessage());
  }
}