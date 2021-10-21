interface Interf {
  
  public int getLength(String s);

}

class Demo implements Interf {
  
  public int getLength(String s) {
    return s.length();
  }

}

class InvokingLambdaTest20 {

  public static void main(String[] args) {

    Interf i = new Demo();
    System.out.println(i.getLength("word"));

  }
}
