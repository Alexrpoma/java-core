package lambdas.calculator;

@FunctionalInterface
public interface Calculator {
  float apply(float a, float b);
  default void result(float number) {
    System.out.println("The result is: " + number);
  }
}
