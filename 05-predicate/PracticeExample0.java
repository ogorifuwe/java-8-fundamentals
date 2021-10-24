import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class PracticeExample0 {

  public static void main(String[] args) {

    String[] names0 = {"Sunny", "Kajal", "Mallika", "Katrina", "Kareena"};
    getNamesStartingWith(names0, 'K');

    String[] names1 = {"Durga", "", null, "Ravi", "", "Shiva", null};
    List<String> res1 = removeNullValuesAndEmptyStrings(names1);
    System.out.println(res1);

  }

  /**
   * prints all names starting with specified character
   */
  public static void getNamesStartingWith(String[] str, char ch) {

    Predicate<String> startsWithK = s -> s.charAt(0) == ch;

    System.out.print("[ ");
    for (String s : str) {
      boolean result = startsWithK.test(s);
      if (result)
        System.out.print(s + ", ");
    }
    System.out.print("] \n");
  }

  /**
   * remove null values and empty strings from the given list
   */
  public static List<String> removeNullValuesAndEmptyStrings(String[] str) {
  
    List<String> l = new ArrayList<>();
    Predicate<String> removeNullValueAndEmptyString = s -> s != null && s.length() != 0;

    for (String s: str) {
      boolean result = removeNullValueAndEmptyString.test(s);
      if (result) {
        l.add(s);
      }
    }
    
    return l;
  }
}
