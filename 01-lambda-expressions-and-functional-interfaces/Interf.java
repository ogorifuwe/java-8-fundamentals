@FunctionalInterface
interface Interf {

  public void m1();

  public void m2();

  default void m2() {
    
  }

  public static void m3() {

  }
}
