import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class StreamMethodsToArray {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>(Arrays.asList(new Integer[]{0, 10, 20, 5, 15, 25}));
    System.out.println(l);

    Integer[] arr = l.stream().toArray(Integer[] :: new);
    for (Integer x : arr)
      System.out.println(x);

  }
}
