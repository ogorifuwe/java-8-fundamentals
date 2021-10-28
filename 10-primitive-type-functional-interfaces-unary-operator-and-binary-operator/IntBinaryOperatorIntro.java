import java.util.function.IntBinaryOperator;

class IntBinaryOperatorIntro {

  public static void main(String[] args) {
    IntBinaryOperator o = (i0, i1) -> i0 + i1;
    int result = o.applyAsInt(10, 20);
    System.out.println(result);
  }
}
