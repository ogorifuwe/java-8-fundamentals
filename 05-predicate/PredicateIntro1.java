import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Predicate;

class PredicateIntro1 {

  public static void main(String[] args) {
    
    boolean res01 = example0("abcdef");
    boolean res02 = example0("abc");

    System.out.println("res01: " + res01);
    System.out.println("res02: " + res02);

    boolean res10 = example1(new ArrayList<>(Arrays.asList(new String[]{"A"})));
    boolean res11 = example1(new ArrayList<>());

    System.out.println("res10: " + res10);
    System.out.println("res11: " + res11);
  }

  public static boolean example0(String str) {
    Predicate<String> p = s -> s.length() > 5;
    return p.test(str);
  }

  public static boolean example1(Collection collection) {
    Predicate<Collection> p = c -> c.isEmpty();
    return p.test(collection);
  }
}
