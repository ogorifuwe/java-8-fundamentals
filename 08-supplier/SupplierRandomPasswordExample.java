/**
 * - Lenght should be 8 characters
 * - 2, 4, 6, 8 places only digits
 * - 1, 3, 5, 7 places only upper case alphabets symbols e.g @, #, $
 */
import java.util.function.Supplier;

class SupplierRandomPasswordExample {

  public static void main(String[] args) {
    System.out.println(generatePassword());
  }

  public static String generatePassword() {

    Supplier<String> passwordGenerator = () -> {
      Supplier<Integer> digit = () -> (int)(Math.random() * 10);
      Character[] chars  = {'A','B','C','D','E','F','G','H','I','J',
                            'K','L','M','N','O','P','Q','R','S','T',
                            'U','V','W','X','Y','Z','#','$','@'};
      Supplier<Character> c = () -> chars[(int)(Math.random() * 29)];

      StringBuilder passwordBuilder = new StringBuilder();
      for (int i = 0; i <= 7; ++i) {
        if (i % 2 == 0) {
          int passwordDigit = digit.get();
          passwordBuilder.append(passwordDigit);
        } else {
            Character alphabetOrSymbol = c.get();
            passwordBuilder.append(alphabetOrSymbol);
        }
      }
      return passwordBuilder.toString();
    };

    String password = passwordGenerator.get();
    return password;
  }
}
