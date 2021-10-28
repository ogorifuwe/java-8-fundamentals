import java.util.function.IntPredicate;

class IntPredicateIntro {
  public static void main(String[] args) {
    int[] x = {0, 5, 10, 15, 20, 25};
    IntPredicate p = i -> i % 2 == 0;

    for (int x1 : x) {
      boolean isEven = p.test(x1);
      if (isEven)
        System.out.println(x1);
    }
  }
}
