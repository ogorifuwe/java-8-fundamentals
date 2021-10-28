import java.util.function.ObjDoubleConsumer;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ObjDoubleConsumerIntro {

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();
    populate(employees);
    ObjDoubleConsumer<Employee> c = (e, a) -> e.salary += a;

    for (Employee employee : employees)
      c.accept(employee, 500.0);

    for (Employee employee : employees) {
      System.out.println("Name: " + employee.name);
      System.out.println("Salary: " + employee.salary);
      System.out.println();
    }
  }

  public static void populate(List<Employee> employees) {
    employees.add(new Employee("Sunny", 1000.0));
    employees.add(new Employee("Bunny", 2000.0));
    employees.add(new Employee("Chinny", 3000.0));
    employees.add(new Employee("Vinny", 4000.0));
    employees.add(new Employee("Pinny", 5000.0));
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
