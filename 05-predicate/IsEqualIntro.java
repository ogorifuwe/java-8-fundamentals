import java.util.function.Predicate;

class IsEqualIntro {

  public static void main(String[] args) {
    
    Predicate<String> p = Predicate.isEqual("DURGASOFT");
    System.out.println(p.test("DURGASOFT"));
    System.out.println(p.test("Mallika"));
  }
}
