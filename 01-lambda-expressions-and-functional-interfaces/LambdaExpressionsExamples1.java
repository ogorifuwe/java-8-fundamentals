/**
 * Examples of methods with their corresponding Lambda Expressions
 */
class LambdaExpressionsExamples1 {

  // this method prints hello to the console
  public static void hello() {
    System.out.println("hello");
  }

  // corresponding Lambda Expression of hello
  () ->  { System.out.println("hello"); }

  
  /**
   * takes two int variables and prints their sum to console
   * @param a, @param b
   */
  public void add(int a, int b) {
    int result = a + b;
    System.out.println(result);
  }

  // corresponding labda expression
  (int a, int b) -> {
    int result = a + b;
    System.out.println(result); 
  }

  /**
   * takes a string argument and returns the length of the argument
   * @param str, a string parameter
   * @return result, the length of str
   */
  public int getLength(String str) {
    int result = str.length();
    return result;
  }

  // corresponding Lambda Expression
  (String str) -> {
    int result = str.length();
    return result;
  }

}
