import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class SortingObjectsIntro {

  public static void main(String[] args) {
  
    case1();

  }

  static void case1() {
  
    List<Employee> l = new ArrayList<>(Arrays.asList(new Employee[]{
      new Employee(200, "Deepika"), new Employee(400, "Sunny"),
      new Employee(300, "Mallika"), new Employee(100, "Katrina")
    }));
    System.out.println(l);

    Collections.sort(l, (o1, o2) -> (o1.id < o2.id) ? -1 : (o1.id > o2.id) ? 1 : 0);
    System.out.println(l);

  }
}

class Employee {

  int id;
  String name;

  Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String toString() {
    return "{id=" + String.valueOf(id) + ", name=" + name + "}";
  }

}
