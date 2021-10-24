import java.util.function.Predicate;

class PredicateJoiningIntro0 {

  public static void main(String[] args) {
  
    int[] x = {0, 5, 10, 15, 20, 25, 30};
    Predicate<Integer> p0 = i -> i > 10;
    Predicate<Integer> p1 = i -> i % 2 == 0;
    
    System.out.println("The numbers greater than 10 are: ");
    m0(p0, x);

    System.out.println("The even numbers are: ");
    m0(p1, x);

    System.out.println("The numbers less than 10 are: ");
    Predicate<Integer> p2 = p0.negate();
    m0(p2, x);

    System.out.println("The numbers that are greater than 10 and even: ");
    Predicate<Integer> p3 = p0.and(p1);
    m0(p3, x);

    System.out.println("The numbers that are greater than 10 or even: ");
    Predicate<Integer> p4 = p0.or(p1);
    m0(p4, x);
  }

  public static void m0(Predicate<Integer> p, int[] x) {
    for (int i: x) {
      boolean res = p.test(i);
      if (res) System.out.print(i + ", ");
    }
    System.out.println();
  }


}
