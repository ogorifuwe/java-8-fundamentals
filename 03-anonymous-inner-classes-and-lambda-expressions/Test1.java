interface Interf {

  public void m1();

}

class Test1 {

  int x = 888;

  public static void main(String[] args) {
    Test1 t = new Test1();
    t.m2();
  }

  public void m2() {
    Interf i = () -> {
      int x = 999; // it is not possible to declare an Ivar in lambda expressions
      System.out.println(this.x);
    };
    i.m1();
  }
}
