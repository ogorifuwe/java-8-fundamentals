import java.util.function.ToIntFunction;

class ToIntFunctionIntro {

  public static void main(String[] args) {
    ToIntFunction<String> f = s -> s.length();
    int result = f.applyAsInt("Durga");
    System.out.println(result);
  }
}
