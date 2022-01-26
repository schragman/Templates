package adapter;

public class Calculator implements CalculatorInterface {

  @Override
  public double calculatesArea(Rectangle rectangle) {
    return rectangle.getLength() * rectangle.getWidth();
  }
}
