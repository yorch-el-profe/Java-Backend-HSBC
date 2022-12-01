public class Main {
  public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance("FOO");
    Singleton s2 = Singleton.getInstance("BAR");

    System.out.println(s1.getValue());
    System.out.println(s2.getValue());

    s1.setValue("ES DE CHILL");

    System.out.println(s1.getValue());
    System.out.println(s2.getValue());
  }
}
