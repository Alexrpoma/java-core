package anonymous_inner_class;

public class App {
  public static void main(String[] args) {
    Shapes shapes = new Shapes();
    Shape circle = shapes.circleShape;
    Shape square = shapes.squareShape;

    System.out.printf("""
        Circle:
        Description: %s
        Colors: %s
        Area: %f
        %n""", circle.description(), circle.colors(), circle.area(12.5f));

    System.out.printf("""
        Square:
        Description: %s
        Colors: %s
        Area: %f
        %n""", square.description(), square.colors(), square.area(16f));

    Triangle triangle = new Triangle(12.3f) {
      @Override
      public String description() {
        return "The triangle has base and height.";
      }
    };

    System.out.printf("""
        Triangle:
        Description: %s
        Colors: %s
        Area: %f
        %n""", triangle.description(), triangle.colors(), triangle.area(23.1f));
  }
}
