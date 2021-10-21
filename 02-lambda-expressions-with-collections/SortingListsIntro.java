import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

class SortingListsIntro {

  public static void main(String[] args) {
    //sortList0();
    sortList1();
  }

  public static void sortList0() {
  
    List<Integer> l =
      new ArrayList<>(Arrays.asList(new Integer[]{10, 0, 15, 5, 20}));
    System.out.println("before sorting: " + l);
    Collections.sort(l, new IntegerListComparator());
    System.out.println("after sorting: " + l);

  }

  public static void sortList1() {
    
    List<Integer> l =
      new ArrayList<>(Arrays.asList(new Integer[]{10, 0, 15, 5, 20}));
    System.out.println("before sorting: " + l);

    Collections.sort(l, (Integer i1, Integer i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
    System.out.println("after sorting: " + l);

  }
}
  
class IntegerListComparator implements Comparator<Integer> {
    
  public int compare(Integer i1, Integer i2) {
    /*if (i1 > i2) {
      return -1;
    } else if (i1 < i2) {
        return 1;
    } else {
        return 0;
    }*/

    return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
  }
}

