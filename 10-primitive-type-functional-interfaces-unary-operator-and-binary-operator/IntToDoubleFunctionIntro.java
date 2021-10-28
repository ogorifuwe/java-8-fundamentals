import java.util.function.IntToDoubleFunction;

class IntToDoubleFunctionIntro {

  public static void main(String[] args) {
    IntToDoubleFunction f = i -> Math.sqrt(i);
    double result = f.applyAsDouble(5);
    System.out.println(result);
  }
}
