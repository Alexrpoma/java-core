package anonymous_inner_class;

import java.util.List;

/**
 * An anonymous class is a local class that does not have a name.
 * It allows you to create a class instance and define its implementation
 * simultaneously, without explicitly declaring a separate class.
 * Anonymous classes are useful when you need to create a small,
 * one-time-use class without the need for re-usability.
 */
public class Shapes {
  Shape circleShape = new Shape() {
    @Override
    public String description() {
      return "The circle has a radius.";
    }

    @Override
    public List<String> colors() {
      return List.of("Red", "Blue", "Green");
    }

    @Override
    public float area(float radius) {
      return (float) (Math.PI * Math.pow(radius, 2));
    }
  };

  Shape squareShape = new Shape() {
    @Override
    public String description() {
      return "A square has equal sides";
    }

    @Override
    public List<String> colors() {
      return List.of("Yellow", "Red");
    }

    @Override
    public float area(float side) {
      return (float) Math.pow(side, 2);
    }
  };
}
