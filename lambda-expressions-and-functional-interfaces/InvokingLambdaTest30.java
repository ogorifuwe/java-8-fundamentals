interface Interf {

  public int squareInt(int x);

}

class Demo implements Interf {

  public int squareInt(int x) {
    return x * x;
  }

}

class InvokingLambdaTest30 {

  public static void main(String[] args) {
    
    Interf i = new Demo();
    int result = i.squareInt(2);
    System.out.println("result: " + result);
  }
}
