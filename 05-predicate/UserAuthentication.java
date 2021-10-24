import java.util.function.Predicate;
import java.util.Scanner;

class UserAuthentication {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Username: ");
    String username = sc.next();
    System.out.print("Enter Password: ");
    String password = sc.next();

    User user = new User(username, password);
    authenticateUser(user);

  }

  public static void authenticateUser(User user) {
    
    Predicate<User> p = u -> u.username.equals("durga") && u.password.equals("java");
    boolean isValid = p.test(user);
    
    if (isValid)
      System.out.println("Valid User, you have access to all services");
    else 
      System.out.println("Invalid User, try signing in again");
  }
}

class User {

  String username;
  String password;

  User (String username, String password) {
    this.username = username;
    this.password = password;
  }


}
