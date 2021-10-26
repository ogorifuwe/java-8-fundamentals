import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

class ConsumerExample0 {
  
  public static void main(String[] args) {
    List<Movie> movies = new ArrayList<>();
    populate(movies);

    Consumer<Movie> c = m -> {
      System.out.println("name: " + m.name);
      System.out.println("hero: " + m.hero);
      System.out.println("heroine: " + m.heroine);
      System.out.println("****************************");
    };

    for (Movie m : movies)
      c.accept(m);
  }

  public static void populate(List<Movie> movies) {
    movies.add(new Movie("Bahubali", "Prabhas", "Anushka"));
    movies.add(new Movie("Rayees", "Sharukh", "Sunny"));
    movies.add(new Movie("Dangal", "Ameer", "Ritu"));
    movies.add(new Movie("Sultan", "Salman", "Anushka"));
  }
}

class Movie {

  String name;
  String hero;
  String heroine;

  Movie(String name, String hero, String heroine) {
    this.name = name;
    this.hero = hero;
    this.heroine = heroine;
  }
}
