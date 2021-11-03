import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

class Intro {

  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date);

    int dd = date.getDayOfMonth();
    int mm = date.getMonthValue();
    int yyyy = date.getYear();

    System.out.println(mm +"..."+ dd +"..."+ yyyy);
    System.out.printf("%d-%d-%d\n\n", mm, dd, yyyy);

    LocalTime time = LocalTime.now();
    System.out.println(time);

    int h = time.getHour();
    int m = time.getMinute();
    int s = time.getSecond();
    int n = time.getNano();
    System.out.printf("%d:%d:%d:%d\n\n", h, m, s, n);

    LocalDateTime dt = LocalDateTime.now();
    System.out.println(dt);

    int _dd = dt.getDayOfMonth();
    int _mm = dt.getMonthValue();
    int _yyyy = dt.getYear();
    System.out.printf("%d-%d-%d\n\n", _mm, _dd, _yyyy);

    int _h = dt.getHour();
    int _m = dt.getMinute();
    int _s = dt.getSecond();
    int _n = dt.getNano();
    System.out.printf("%d:%d:%d:%d\n\n", _h, _m, _s, _n);

    LocalDateTime _dt = LocalDateTime.of(1995, 05, 28, 12, 45);
    System.out.println(_dt);
    System.out.println("After Six Months: " + _dt.plusMonths(6));
    System.out.println("Before Six Months: " + _dt.minusMonths(6));
  }
}
