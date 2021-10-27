import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BiConsumerAndBiFunctionExample {

  public static void main(String[] args) {
    BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);
    List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee[]{
                                                                            f.apply("Durga", 1000.0),
                                                                            f.apply("Sunny", 2000.0),
                                                                            f.apply("Bunny", 3000.0),
                                                                            f.apply("Chinny", 4000.0)}));

    BiConsumer<Employee, Double> c = (e, incrementAmount) ->  e.salary += incrementAmount;

    for (Employee employee : employees) {
      c.accept(employee, 500.0);
    }

    for (Employee employee: employees) {
      System.out.println(employee.name);
      System.out.println(employee.salary);
    }
  }
}

class Employee {

  String name;
  Double salary;

  Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }
}
