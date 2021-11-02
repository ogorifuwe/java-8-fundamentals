import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class StreamMethodsForEach {
  
  public static void main(String[] args) {
    List<String> l = new ArrayList<>(Arrays.asList(new String[]{"A", "BB", "CCC"}));
    l.stream().forEach(s -> System.out.println(s));
    l.stream().forEach(System.out :: println);
  }

}
