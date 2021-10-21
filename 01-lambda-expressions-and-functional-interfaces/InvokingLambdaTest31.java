interface Interf {

  public int squareInt(int x);

}

class InvokingLambdaTest31 {

  public static void main(String[] args) {
    
    Interf i = x -> x * x;
    int result = i.squareInt(2);
    System.out.println("result: " + result);
  }
}
