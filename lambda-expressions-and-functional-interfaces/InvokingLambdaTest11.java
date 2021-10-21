interface Interf {

  public void add(int a, int b);

}

class InvokingLambdaTest11 {
  
  public static void main(String[] args) {
  
    Interf i = (a, b) -> System.out.println("The sum: " + (a + b));
    i.add(2, 3);
    i.add(5, 9);
  }
}
