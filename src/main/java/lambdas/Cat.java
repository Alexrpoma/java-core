package lambdas;

public class Cat {
  private final String name;
  private final int age;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String showPet(Printable p, String sound) {
    return "The %s cat is %d years old and say %s".formatted(name, age, p.print(sound));
  }
}
