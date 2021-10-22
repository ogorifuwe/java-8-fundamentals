interface Interf {

  default void m1() {
    System.out.println("from default method");
  }

}

class Test1 implements Interf {

  public static void main(String[] args) {
    Test1 t = new Test1();
    t.m1();
  }

  @Override
  public void m1() {
    System.out.println("from implmenting class");
  }
}
