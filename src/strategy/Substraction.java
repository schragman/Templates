package strategy;

public class Substraction implements Strategy {
  @Override
  public void performOperation(int subtrahend, int minuend) {
    System.out.println(subtrahend + " - " + minuend + " = " + (subtrahend - minuend));
  }
}
