import java.util.function.Predicate;

class PredicateIntro0 {

    public static void main(String[] args) {
      
      Example0 e = new Example0();
      boolean res00 = e.example0(100);
      boolean res10 = e.p.test(100);
      boolean res20 = e.example1(100);

      System.out.println("res00: " + res00);
      System.out.println("res10: " + res10);
      System.out.println("res20: " + res20);

    }

  public boolean example0(Integer i) {
    return i > 10;
  }

  Predicate<Integer> p = i -> i > 10;

  public boolean example1(Integer i) {
    Predicate<Integer> p = x -> x > 10;
    return p.test(i);
  }
}
