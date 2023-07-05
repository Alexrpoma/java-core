package inner_class;

public class App {
  public static void main(String[] args) {

    ComputerCase computerCase = new ComputerCase("White", true, 3); //Outer Class
    ComputerCase.MotherBoard motherBoard = computerCase.new MotherBoard("Asus", "Black", "Z690"); //Inner Class
    ComputerCase.Ram ram = new ComputerCase.Ram("VENGEANCE", "Corsair", true, true, 16);  //Static Inner Class

    computerCase.computerSpecification(computerCase, motherBoard, ram);  //Use a Local Inner Class
  }
}
