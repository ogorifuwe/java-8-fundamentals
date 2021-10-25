import java.util.function.Function;

class FunctionChainingExample0 {

  public static void main(String[] args) {
    Function<Integer, Integer> f0 = i -> i + i;
    Function<Integer, Integer> f1 = i -> i * i * i;
    System.out.println(f0.andThen(f1).apply(2));
    System.out.println(f0.compose(f1).apply(2));
  }
}
