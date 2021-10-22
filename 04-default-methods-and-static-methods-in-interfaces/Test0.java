interface Interf {

  default void m1() {
    System.out.println("from default method");
  }

}

class Test0 implements Interf {

  public static void main(String[] args) {
    Test0 t = new Test0();
    t.m1();
  }

}
