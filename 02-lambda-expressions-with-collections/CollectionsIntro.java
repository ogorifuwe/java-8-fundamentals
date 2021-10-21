class CollectionsIntro {
  
  public static void main(String[] args) {
      listImpl();
      setImpl();
      mapImpl();
  }
  
  public static void listImpl() {
    
    java.util.List<String> l =
      new java.util.ArrayList<String>();
    l.add("Sunny");
    l.add("Bunny");
    l.add("Chinny");
    l.add("Sunny");
    System.out.println(l);

  }

  public static void setImpl() {
    
    java.util.Set<String> h =
      new java.util.HashSet<String>();
    h.add("Sunny");
    h.add("Bunny");
    h.add("Chinny");
    h.add("Sunny");
    System.out.println(h);

  }

  public static void mapImpl() {
    
    java.util.Map<String, String> m =
      new java.util.HashMap<String, String>();
    m.put("A", "Apple");
    m.put("Z", "Zebra");
    m.put("J", "Java");
    m.put("B", "Boy");
    m.put("T", "Tiger");
    System.out.println(m);

  }

}
