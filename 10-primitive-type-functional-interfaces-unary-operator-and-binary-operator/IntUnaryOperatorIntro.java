import java.util.function.IntUnaryOperator;

class IntUnaryOperatorIntro {

  public static void main(String[] args) {
    IntUnaryOperator o = i -> i * i;
    int result = o.applyAsInt(10);
    System.out.println(result);
  }
}
