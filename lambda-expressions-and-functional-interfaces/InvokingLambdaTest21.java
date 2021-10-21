interface Interf {

  public int getLength(String s);

}

class InvokingLambdaTest21 {

  public static void main(String[] args) {
    
    Interf i = s -> s.length();
    System.out.println(i.getLength("word"));
  }
}
