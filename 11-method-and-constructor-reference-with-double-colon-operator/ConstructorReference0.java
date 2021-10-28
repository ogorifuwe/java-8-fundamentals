class ConstructorReference0 {

  public static void main(String[] args) {
    Interf i = Sample :: new;
    i.get();
  }
}

class Sample {
  Sample() {
    System.out.println("overriden default method");
  }
}

interface Interf {

  public Sample  get();
}


