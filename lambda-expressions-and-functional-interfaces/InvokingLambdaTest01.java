interface Interf {
  
  public void m1();

}

class InvokingLambdaTest01 {

  public static void main(String[] args) {
    
    Interf i = () -> System.out.println("Lambda Expression Implementation");
    i.m1();
  }
}
