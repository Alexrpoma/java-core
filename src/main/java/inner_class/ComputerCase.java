package inner_class;

public class ComputerCase {   //Outer Class
  private final String color;
  private final boolean rgb;
  private final int coolers;

  public ComputerCase(String color, boolean rgb, int coolers) {
    this.color = color;
    this.rgb = rgb;
    this.coolers = coolers;
  }

  public void computerSpecification(ComputerCase computerCase, MotherBoard motherBoard, Ram ram) {
    class ShowInfo {    //Local Inner Class
      public void run() {
        System.out.println(computerCase);
        System.out.println(motherBoard);
        System.out.println(ram);
      }
    }
    ShowInfo info = new ShowInfo();
    info.run();
  }

  class MotherBoard {   //Inner Class
     private final String brand;
     private final String color;
     private final String series;

    public MotherBoard(String brand, String color, String series) {
      this.brand = brand;
      this.color = color;
      this.series = series;
    }

    @Override
    public String toString() {
      return "MotherBoard{" +
          "brand='" + brand + '\'' +
          ", color='" + color + '\'' +
          ", series='" + series + '\'' +
          '}';
    }
  }

  static class Ram {    //Static Inner Class
    private final String series;
    private final String brand;
    private final boolean heatSink;
    private final boolean dual;
    private final int gb;

    public Ram(String series, String brand, boolean heatSink, boolean dual, int gb) {
      this.series = series;
      this.brand = brand;
      this.heatSink = heatSink;
      this.dual = dual;
      this.gb = gb;
    }

    @Override
    public String toString() {
      return "Ram{" +
          "series='" + series + '\'' +
          ", brand='" + brand + '\'' +
          ", heatSink=" + heatSink +
          ", dual=" + dual +
          ", gb=" + gb +
          '}';
    }
  }

  @Override
  public String toString() {
    return "ComputerCase{" +
        "color='" + color + '\'' +
        ", rgb=" + rgb +
        ", coolers=" + coolers +
        '}';
  }
}
