package adapter;

public class CalculatorAdapter implements CalculatorInterface {

  private Triangle triangle;
  private Calculator calculator;

  public CalculatorAdapter(Triangle triangle) {
    this.triangle = triangle;
  }

  @Override
  public double calculatesArea(Rectangle rectangle) {
    calculator = new Calculator();
    Rectangle convRec = new Rectangle(triangle.getBase(), triangle.getHeight()*0.5);
    return calculator.calculatesArea(convRec);

  }
}
