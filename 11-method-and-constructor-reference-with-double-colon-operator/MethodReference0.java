interface Interf {
  public void m0();
}

class MethodReference0 {
  
  public static void main(String[] args) {
    Interf i = MethodReference0::m1;
    i.m0();
  }

  public static void m1() {
    System.out.println("Implementation By Method Reference");
  }
}
