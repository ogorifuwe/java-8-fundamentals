interface Interf {

  public void m1();

}

class Test0 {

  int x = 888;

  public static void main(String[] args) {
    
    Test0 t = new Test0();
    t.m2();
  }

  public void m2() {
    
    Interf i = new Interf() {

      int x = 999;

      public void m1() {
        System.out.println(this.x);
        System.out.println(Test0.this.x);
      }
    };
    i.m1();
  }

}
