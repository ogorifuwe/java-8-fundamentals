import java.util.function.UnaryOperator;

class UnaryOperatorIntro {

  public static void main(String[] args) {
    UnaryOperator<Integer> o = i -> i * i;
    Integer result = o.apply(10);
    System.out.println(result);
  }
}
