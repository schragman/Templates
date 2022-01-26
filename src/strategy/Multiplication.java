package strategy;

public class Multiplication implements Strategy {
  @Override
  public void performOperation(int factor1, int factor2) {
    System.out.println(factor1 + " * " + factor2 + " = " + (factor1 * factor2));
  }
}
