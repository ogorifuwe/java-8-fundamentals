import java.util.function.BiFunction;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BiFunctionExample0 {
  public static void main(String[] args) {

    BiFunction<String, Integer, Student> f = (name, rollNo) -> new Student(name, rollNo);
    List<Student> students = new ArrayList<>(Arrays.asList(new Student[]{
                                                              f.apply("Durga", 100),
                                                              f.apply("Ravi", 200),
                                                              f.apply("Shiva", 300)}));

    for (Student student: students)
      System.out.println(student);
  }

}

class Student {

  String name;
  Integer rollNo;

  Student(String name, Integer rollNo) {
    this.name = name;
    this.rollNo = rollNo;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nRoll No.: " + rollNo + "\n";
  }
}
