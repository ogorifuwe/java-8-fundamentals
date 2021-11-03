import java.time.ZoneId;
import java.time.ZonedDateTime;

class ZoneIntro {

  public static void main(String[] args) {
    ZoneId zone = ZoneId.systemDefault();
    System.out.println(zone);

    ZoneId la = ZoneId.of("America/Los_Angeles");
    ZonedDateTime laDT = ZonedDateTime.now(la);
    System.out.println(laDT);
  }
}
