package adapter;

public class Client {

  public static void main(String[] args) {

    Rectangle rec = new Rectangle(10, 20);

    Triangle tri = new Triangle(10, 20);

    Calculator calc = new Calculator();

    CalculatorAdapter adaptedCalculator = new CalculatorAdapter(tri);

    System.out.println("The area of a Rectangle is " + calc.calculatesArea(rec));

    System.out.println("The area of a Triangel is " +
        adaptedCalculator.calculatesArea(null));

  }

}
