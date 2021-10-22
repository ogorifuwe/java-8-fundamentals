interface Left {

  default void m1() {
    System.out.println("Left's default method");
  }
}

interface Right {

  default void m1() {
    System.out.println("Right's default method");
  }
}

class Test2 implements Left, Right {

  public static void main(String[] args) {
    Test2 t = new Test2();
    t.m1();
  }

  @Override
  public void m1() {
    System.out.println("Implementing class' method");
    //Left.super.m1();
    //Right.super.m1();
  }
}
