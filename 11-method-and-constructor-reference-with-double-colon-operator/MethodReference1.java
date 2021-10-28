class MethodReference1 {

  public static void main(String[] args) {
    MethodRefernce1 mR = new MethodReference1();
    Runnable r = mR::m1;
    Thread t = new Thread(r);
    t.start();

    for (int i = 0; i < 10; ++i)
      System.out.println("main thread");
  }

  public void m1() {
    for (int i = 0; i < 10; ++i)
      System.out.println("child thread");
  }
}
