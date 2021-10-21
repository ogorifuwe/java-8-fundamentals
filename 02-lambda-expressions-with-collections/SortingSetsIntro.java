import java.util.Set;
import java.util.TreeSet;

class SortingSetsIntro {

  public static void main(String[] args) {
     
    //case1();
    case2();

  }

  static void case1() {

    Set<Integer> s = new TreeSet<Integer>();
    s.add(10);
    s.add(0);
    s.add(15);
    s.add(25);
    s.add(5);
    s.add(20);
    System.out.println(s);

  }

  static void case2() {

    Set<Integer> s = new TreeSet<Integer>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
    s.add(10);
    s.add(0);
    s.add(15);
    s.add(25);
    s.add(5);
    s.add(20);
    System.out.println(s);

  }
}
