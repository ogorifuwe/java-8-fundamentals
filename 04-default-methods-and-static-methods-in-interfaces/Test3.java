interface Interf {

  public static void m1() {
    System.out.println("inside interface static method");
  }
}

class Test3 implements Interf {

  public static void main(String[] args) {
    //m1();
    Test3 t = new Test3();
    //t.m1();
    //Test3.m1();
    Interf.m1();
  }
}
