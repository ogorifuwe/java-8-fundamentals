import java.util.function.Supplier;
import java.util.Date;

class SupplierIntro {

  public static void main(String[] args) {
    // supplier for new Date
    Supplier<Date> s0 = () -> new Date();
    System.out.println(s0.get());

    Supplier<String> s1 = () -> {
      String[] str = {"Sunny", "Bunny", "Chinny", "Vinny"};
      int index = (int)(Math.random() * str.length);
      return str[index];
    };

    System.out.println(s1.get());
    System.out.println(s1.get());
    System.out.println(s1.get());
    System.out.println(s1.get());
  }
}
