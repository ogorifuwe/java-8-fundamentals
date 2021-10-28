import java.util.function.IntFunction;

class IntFunctionIntro {
  public static void main(String[] args) {
    IntFunction<Integer> f = i -> i * i;
    Integer result = f.apply(5);
    System.out.println(result);
  }
}
