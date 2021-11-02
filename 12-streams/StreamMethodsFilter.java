import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamMethodsFilter {

  public static void main(String[] args) {
    List<String> l = new ArrayList<>(Arrays.asList(new String[]{
                                                                "Pavan",
                                                                 "RaviTeja",
                                                                 "Chiranjeevi",
                                                                 "Venkatesh",
                                                                 "Nagarjuna"}));

    List<String> l1 = l.stream().filter(name -> name.length() >= 9).collect(Collectors.toList());
    System.out.println(l1);

    List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
    System.out.println(l2);

    long count = l.stream().filter(s -> s.length() >= 9).count();
    System.out.println(count);
  }
}
