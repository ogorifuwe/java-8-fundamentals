import java.util.function.Supplier;

class SupplierOTPExample {

  public static void main(String[] args) {
    
    System.out.println(getOTP());
    System.out.println(getOTP());
    System.out.println(getOTP());
    System.out.println(getOTP());
    System.out.println(getOTP());
  }

  private static String getOTP() {
    
    Supplier<String> otpGenerator = () -> {
      
      StringBuilder otpBuilder = new StringBuilder();

      for (int i = 0; i <= 5; ++i) {
        int digit = (int)(Math.random() * 10);
        char digitChar = (char)(digit + '0');
        otpBuilder.append(digitChar);
      }

      String otp = otpBuilder.toString();
      return otp;
    };

    String oneTimePassword = otpGenerator.get();
    return oneTimePassword;
  }
}
