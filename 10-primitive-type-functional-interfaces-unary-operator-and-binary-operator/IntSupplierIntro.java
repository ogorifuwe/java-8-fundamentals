import java.util.function.IntSupplier;

class IntSupplierIntro {

  public static void main(String[] args) {
    IntSupplier s = () -> (int)(Math.random() * 10);
    StringBuilder otpBuilder = new StringBuilder();
    for (int i = 0; i <= 5; ++i) {
      char c = (char)(s.getAsInt() + '0');
      otpBuilder.append(c);
    }

    String otp = otpBuilder.toString();
    System.out.println(otp);
  }
}
