interface Interf {

  public void m1();
}

class Demo implements Interf {
  
  public void m1() {
    System.out.println("OOP Implementation");
  }

}

class InvokingLambdaTest00 {

  public static void main(String[] args) {
    Interf i = new Demo();
    i.m1();
  }
}
