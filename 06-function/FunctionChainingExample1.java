import java.util.function.Function;
import java.util.Scanner;

class FunctionChainingExample1 {

  public static void main(String[] args) {
    
    Function<String, String> f0 = s -> s.toLowerCase();
    Function<String, String> f1 = s -> s.substring(0, 5);

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = sc.next();
    System.out.print("Enter password: ");
    String password = sc.next();

    if (f0.andThen(f1).apply(username).equals("durga") && password.equals("java"))
      System.out.println("Valid User");
    else
      System.out.println("Invalid User");

    Function<String, String> f2 = Function.identity();
    String s = f2.apply("test");
    System.out.println(s);
  }
}
