package ema;

class Employee {

  String name;
  String designation;
  double salary;
  String city;

  Employee(String name, String designation,
           double salary, String city) {
    this.name = name;
    this.designation = designation;
    this.salary = salary;
    this.city = city;
  }

  @Override
  public String toString() {
    String s = String.format("[%s, %s, %.2f, %s]", name, designation, salary, city);
    return s;
  }

  @Override
  public boolean equals(Object  object) {
    Employee e = (Employee)object;

    if (e.name.equals(name) && e.designation.equals(designation)
        && e.salary == salary && e.city.equals(city)) {
      return true;
    } else {
        return false;
    }
  }

}
