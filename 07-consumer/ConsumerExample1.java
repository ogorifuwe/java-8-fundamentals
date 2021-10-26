import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;

class ConsumerExample1 {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    populate(students);

    Predicate<Student> p = s -> s.mark >= 60;
    
    Function<Student, String> f = s -> {
      StringBuffer grade = new StringBuffer();
      int mark = s.mark;

      if (mark >= 80)
        grade.append("A");
      else if (mark >= 65)
        grade.append("B");
      else if (mark >= 55)
        grade.append("C");
      else if (mark >= 45)
        grade.append("D");
      else
        grade.append("F");

      return grade.toString();
    };

    Consumer<Student> c = s -> {
      System.out.println("Name: " + s.name);
      System.out.println("Marks: " + s.mark);
      System.out.println("Grade: " + f.apply(s));
      System.out.println();
    };

    for (Student s : students) {
      //if (p.test(s))
        c.accept(s);
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

  Student(String name, int mark) {
    this.name = name;
    this.mark = mark; 
  }
}
