package anonymous_inner_class;

import java.util.List;

public class Triangle implements Shape{
  private final float height;

  public Triangle(float height) {
    this.height = height;
  }

  @Override
  public String description() {
    return "The triangle has corners.";
  }

  @Override
  public List<String> colors() {
    return List.of("White", "Brown", "Pink");
  }

  @Override
  public float area(float base) {
    return (base * height) / 2;
  }
}
