import java.util.function.IntConsumer;

class IntConsumerIntro {

  public static void main(String[] args) {
    IntConsumer c = i -> System.out.println("The square of input: " + (i*i));
    c.accept(10);
  }

}
