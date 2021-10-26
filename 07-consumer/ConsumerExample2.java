import java.util.function.Consumer;

class ConsumerExample2 {

  public static void main(String[] args) {
    
    Consumer<Movie> c0 = m -> System.out.println("Movie: " + m.name + " is ready to be released.");
    Consumer<Movie> c1 = m -> System.out.println("Movie: " + m.name + " is " + m.result);
    Consumer<Movie> c2 = m -> System.out.println("Movie: " + m.name + " info storing in DB.");
    Consumer<Movie> chainedC = c0.andThen(c1).andThen(c2);

    Movie m = new Movie("Bahubali", "hit");
    chainedC.accept(m);
  }

  
}

class Movie {

  String name;
  String result;

  Movie(String name, String result) {
    this.name = name;
    this.result = result;
  }
}
