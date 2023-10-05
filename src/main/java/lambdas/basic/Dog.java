package lambdas.basic;

public class Dog {
  private final String name;
  private final int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String showPet(Printable p, String sound) {
    return "The %s dog is %d years old and say %s".formatted(name, age, p.print(sound));
  }
}
