import java.util.function.BiFunction;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class BiFunctionExample1 {

  public static void main(String[] args) {
    BiFunction<Employee, TimeSheet, Double> f = (e, t) -> e.dailyWage * t.days;
    Employee e = new Employee(101, "Durga", 1500);
    TimeSheet t = new TimeSheet(101, 25);
    Double monthlySalary = f.apply(e, t);
    System.out.println("Employee's Monthly Salary: " + monthlySalary);

  }
}

class Employee {

  Integer employeeNo;
  String name;
  Double dailyWage;

  Employee(Integer employeeNo, String name, double dailyWage) {
    this.employeeNo = employeeNo;
    this.name = name;
    this.dailyWage = dailyWage;
  }
}

class TimeSheet {

  Integer employeeNo;
  Integer days;

  TimeSheet(Integer employeeNo, Integer days) {
    this.employeeNo = employeeNo;
    this.days = days;
  }
}
