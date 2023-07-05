package lambdas;

public class App {
  public static void main(String[] args) {
    Dog rocky = new Dog("rocky", 1);
    String sound = "Woof";
    String rockyInfo = rocky.showPet(s -> s + "!!", sound);
    System.out.println(rockyInfo);

    Cat cookie = new Cat("cookie", 2);
    System.out.println(cookie.showPet(s -> s, " Meow!"));
  }
}
