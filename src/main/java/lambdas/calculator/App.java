package lambdas.calculator;

public class App {
  public static void main(String[] args) {
    calc(12, 43.3f);
  }
  public static void calc(float numberA, float numberB) {

    Calculator addition = (a, b) -> (a + b);
    Calculator subtraction = (a, b) -> (a - b);
    Calculator multiplication = (a, b) -> (a * b);
    Calculator division = (a, b) -> (a / b);

    float res0 = addition.apply(numberA, numberB);
    float res1 = subtraction.apply(numberA, numberB);
    float res2 = multiplication.apply(numberA, numberB);
    float res3 = division.apply(numberA, numberB);

    addition.result(res0);
    subtraction.result(res1);
    multiplication.result(res2);
    division.result(res3);
  }
}
