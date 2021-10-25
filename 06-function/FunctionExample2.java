import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

class FunctionExample2 {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    populate(employees);
    System.out.println("Employees before increment:");
    System.out.println(employees);
    
    Predicate<Employee> p0 = e -> e.salary < 3500;
    Function<Employee, Employee> f0 = e -> {
      e.salary += 477;
      return e;
    };

    List<Employee> updatedEmployees = new ArrayList<>();

    for (Employee e : employees) {
      boolean isResult = p0.test(e);
      if (isResult) {
        Employee updatedEmployee = f0.apply(e);
        updatedEmployees.add(updatedEmployee);
      }
    }

    System.out.println("After Increment:");
    System.out.println(updatedEmployees);
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
