import java.util.function.Predicate;

class AllowEntry {
  
  static SoftwareEngineer[] list = {
    new SoftwareEngineer("Durga", 60, false),
    new SoftwareEngineer("Sunil", 25, true),
    new SoftwareEngineer("Sayan", 26, true),
    new SoftwareEngineer("Subbu", 28, false),
    new SoftwareEngineer("Ravi", 17, true)
  };

  static {
    Predicate<SoftwareEngineer> isAllowedIn = swe -> swe.age >= 18 && swe.isAllowed;
    System.out.println("Allowed Engineers are: ");
    for (SoftwareEngineer s : list) {
      boolean result = isAllowedIn.test(s);
      if (result)
        System.out.println(s);
    }
  }

  public static void main(String[] args) {
    AllowEntry a = new AllowEntry();
  }

}

class SoftwareEngineer {

  String name;
  int age;
  boolean isAllowed;

  SoftwareEngineer(String name, int age, boolean isAllowed) {
    this.name = name;
    this.age = age;
    this.isAllowed = isAllowed;
  }

  @Override
  public String toString() {
    return name;
  }
}
