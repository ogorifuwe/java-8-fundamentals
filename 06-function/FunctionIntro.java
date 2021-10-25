import java.util.function.Function;

class FunctionIntro {

  public static void main(String[] args) {
    
    Function<String, Integer> f0 = s -> s.length();
    Integer res0 = f0.apply("Java");
    System.out.println(res0);

    Function<Integer, Integer> f1 = num -> num * num;
    Integer res1 = f1.apply(2);
    System.out.println(res1);

    Function<String, String> f2 = s -> s.replaceAll(" ", "");
    String inputString = "Coming to America";
    String res2 = f2.apply(inputString);
    System.out.println(res2);

    Function<String, Integer> f3 = s -> s.length() - s.replaceAll(" ", "").length();
    Integer res3 = f3.apply(inputString);
    System.out.println(res3);
  }
}
