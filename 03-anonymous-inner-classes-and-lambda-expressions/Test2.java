interface Interf {

  public void m1();
}

class Test2 {

  int x = 10;

  public static void main(String[] args) {
    Test2 t = new Test2();
    t.m2();
  }

  public void m2() {
    int y = 20;// implicitly declared as final
    // the below scope is referred as a closure
    Interf i = () -> {
      x = 888;
      //y = 999;
      System.out.println(x);
      System.out.println(y);
    };
    i.m1();
  }
}
