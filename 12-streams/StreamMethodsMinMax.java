import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamMethodsMinMax {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>(Arrays.asList(new Integer[]{0, 10, 20, 5, 15, 25}));
    System.out.println("List of Integer Values: " + l);

    Integer minInteger = l.stream().min((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("Min Value: " + minInteger);

    Integer maxInteger = l.stream().max((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("Max Value: " + maxInteger);
  }
}
