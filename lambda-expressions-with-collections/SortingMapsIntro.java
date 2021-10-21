import java.util.Map;
import java.util.TreeMap;

class SortingMapsIntro {

  public static void main(String[] args) {
    
    case1();
    case2();

  }

  static void case1() {
    
    Map<Integer, String> m = new TreeMap<Integer, String>();
    m.put(100, "Durga");
    m.put(600, "Sunny");
    m.put(300, "Bunny");
    m.put(200, "Chinny");
    m.put(700, "Vinny");
    m.put(400, "Pinny");
    System.out.println(m);

  }

  static void case2() {
  
    Map<Integer, String> m =
      new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
    m.put(100, "Durga");
    m.put(600, "Sunny");
    m.put(300, "Bunny");
    m.put(200, "Chinny");
    m.put(700, "Vinny");
    m.put(400, "Pinny");
    System.out.println(m);

  }
}
