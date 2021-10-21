interface Interf {

  public void add(int a, int b);

}

class Demo implements Interf {

  public void add(int a, int b) {

    System.out.println("The sum: " + (a + b));

  }

}

class InvokingLambdaTest10 {
  
  public static void main(String[] args) {
  
    Interf i = new Demo();
    i.add(2, 3);
  }
}
