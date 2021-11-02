import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamMethodsSorted {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>(Arrays.asList(new Integer[]{0, 10, 20, 5, 15, 25}));
    System.out.println(l);

    List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
    System.out.println(l1);

    List<Integer> l2 = l.stream()
      .sorted((i1, i2) -> -i1.compareTo(i2))
      .collect(Collectors.toList());
    System.out.println(l2);
  }
}
