class Test0 {

  public static void main(String[] args) {
    // Autoboxing
    Integer i = 10; // Integer.valueOf(10);
    System.out.println(i);

    // Autounboxing
    Integer I = new Integer(10);
    int x = I; // I.intValue();
  }
}
