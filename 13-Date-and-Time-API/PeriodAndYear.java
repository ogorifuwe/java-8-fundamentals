import java.time.LocalDate;
import java.time.Period;
import java.time.Year;

import java.util.Scanner;

class PeriodAndYear {

  public static void main(String[] args) {
    LocalDate birthday = LocalDate.of(1989, 8, 28);
    LocalDate today = LocalDate.now();
    Period p = Period.between(birthday, today);

    System.out.printf("Your Age is %d years %d months and %d\n\n",
        p.getYears(), p.getMonths(), p.getDays());

    LocalDate deathDay = LocalDate.of(1989 + 90, 06, 15);
    Period p1 = Period.between(today, deathDay);
    int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
    System.out.printf("You will be on earth atleast %d days.\n\n", d);

    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    isLeapYear(year);
  }

  public static void isLeapYear(int year) {
    Year y = Year.of(year);
    boolean isLeap = y.isLeap();
    if (isLeap)
      System.out.printf("%d is a Leap Year\n\n", year);

    System.out.printf("%d is not a Leap Year\n\n", year);
  }
}
