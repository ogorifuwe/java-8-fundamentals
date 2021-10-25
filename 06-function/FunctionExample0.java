import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

class FunctionExample0 {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    populate(students);

    Function<Student, String> f0 = s -> {
      StringBuffer result = new StringBuffer();
      int mark = s.mark;
      if (mark >= 80)
        result.append("A[Distinction]");
      else if (mark >= 60)
        result.append("B[First Class]");
      else if (mark >= 50)
        result.append("C[Second Class]");
      else if (mark >= 35)
        result.append("D[Third Class]");
      else
        result.append("E[Fail]");

      return result.toString();
    };

    for (Student s : students) {
      System.out.println("Student Name: " + s.name);
      System.out.println("Student Mark: " + s.mark);
      String grade = f0.apply(s);
      System.out.println("Student Grade: " + grade);
      System.out.println();
    }

    Predicate<Student> p0 = s -> s.mark >= 60;

    for (Student student : students) {
      boolean isResult = p0.test(student);
      if (isResult) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Mark: " + student.mark);
        String grade = f0.apply(student);
        System.out.println("Student Grade: " + grade);
        System.out.println(); 
      }

    }
  }

  public static void populate(List<Student> students) {
    students.add(new Student("Sunny", 100));
    students.add(new Student("Bunny", 65));
    students.add(new Student("Chinny", 55));
    students.add(new Student("Vinny", 45));
    students.add(new Student("Pinny", 25));
  }
}

class Student {
  String name;
  int mark;

  Student(String name, int marks) {
    this.name = name;
    this.mark = marks;
  }
}
