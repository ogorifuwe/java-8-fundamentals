import java.util.function.Function;
import java.util.List;
import java.util.ArrayList;

class FunctionExample1 {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    populate(employees);
    System.out.println(employees);

    Function<List<Employee>, Double> f0 = e -> {
      Double total = 0.0;
      for (Employee employee : e)
        total += employee.salary;

      return total;
    };

    Double total = f0.apply(employees);
    System.out.println("Total salary of all Employees combined is: " + total);


  }

  private static void populate(List<Employee> employees) {
    employees.add(new Employee("Sunny", 1000.0));
    employees.add(new Employee("Bunny", 2000.0));
    employees.add(new Employee("Chinny", 3000.0));
    employees.add(new Employee("Pinny", 4000.0));
    employees.add(new Employee("Vinny", 5000.0));
  }
}

class Employee {
  String name;
  Double salary;

  Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String toString() {
    return name + " : " + salary;
  }
}
