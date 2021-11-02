import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class StreamFilterAndMap0 {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>(Arrays.asList(new Integer[]{0, 10, 20, 5, 15, 25}));
    List<Integer> evenNumbersInL = l.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumbersInL);

    List<Integer> doubleElementsInL = l.stream().map(n -> n * 2).collect(Collectors.toList());
    System.out.println(doubleElementsInL);
  }
}
