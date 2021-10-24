package ema;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

class App {

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();
    employees = populateList(employees);


    Predicate<Employee> p0 = employee -> employee.designation.equals("Manager");

    Predicate<Employee> p1 = employee -> employee.city.equals("Bangalore");

    Predicate<Employee> p2 = employee -> employee.salary < 20000;

    Predicate<Employee> p3 = p0.and(p1);

    Predicate<Employee> p4 = p0.or(p2);

    Predicate<Employee> p5 = p0.negate();

    System.out.println("Employees who are Managers:"); 
    displayEmployees(p0, employees);

    System.out.println("Employees from Bangalore:");
    displayEmployees(p1, employees);

    System.out.println("Employees who make less than 20000:");
    displayEmployees(p2, employees);

    System.out.println("Employees who are Managers and from Bangalore:");
    displayEmployees(p3, employees);

    System.out.println("Employees who are Managers or make less than 20000");
    displayEmployees(p4, employees);

    System.out.println("Employees who are not Managers");
    displayEmployees(p5, employees);

    Predicate<Employee> isCEO = Predicate.isEqual(new Employee("Durga", "CEO", 30000, "Hyderabad"));
    Employee e1 = new Employee("Durga", "CEO", 30000, "Hyderabad");
    Employee e2 = new Employee("Sunny", "Manager", 20000, "Hyderabad");
    System.out.println(isCEO.test(e1));
    System.out.println(isCEO.test(e2));
  }

  private static void displayEmployees(Predicate<Employee> predicate, List<Employee> employees) {

    for (Employee employee : employees) {
      boolean isResult = predicate.test(employee);
      if (isResult)
        System.out.println(employee);
    }
    System.out.println("****************************************************");
  }

  private static final List<Employee> populateList(List<Employee> employeeList) {
    employeeList = new ArrayList<>(Arrays.asList(new Employee[]{
                    new Employee("Durga", "CEO", 30000, "Hyderabad"),
                    new Employee("Sunny", "Manager", 20000, "Hyderabad"),
                    new Employee("Mallika", "Manager", 20000, "Bangalore"),
                    new Employee("Kareena", "Lead", 15000, "Hyderabad"),
                    new Employee("Katrina", "Lead", 15000, "Bangalore"),
                    new Employee("Anushka", "Developer", 10000, "Hyderabad"),
                    new Employee("Kanushka", "Developer", 10000, "Bangalore"),
                    new Employee("Sowmya", "Developer", 10000, "Bangalore"),
                    new Employee("Ramya", "Developer", 10000, "Bangalore")
    }));

    return employeeList;
  }
  
}
