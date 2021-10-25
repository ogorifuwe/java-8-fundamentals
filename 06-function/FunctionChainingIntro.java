import java.util.function.Function;

class FunctionChainingIntro {

  public static void main(String[] args) {

    Function<String, String> f0 = s -> s.toUpperCase();
    Function<String, String> f1 = s -> s.substring(0, 9);
    
    System.out.println(f0.apply("Aishwaryaabhi"));
    System.out.println(f1.apply("Aishwaryaabhi"));
    System.out.println(f0.andThen(f1).apply("Aishwaryaabhi"));
    System.out.println(f0.compose(f1).apply("Aishwaryaabhi"));

  }

}
