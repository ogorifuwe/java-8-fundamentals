import java.util.function.BinaryOperator;

class BinaryOperatorIntro {

  public static void main(String[] args) {
    BinaryOperator<String> o = (s0, s1) -> s0 + s1;
    String result = o.apply("Durga", "Soft");
    System.out.println(result);
  }
}
