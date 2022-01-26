package strategy;

public class Addition implements Strategy {
  @Override
  public void performOperation(int summand1, int summand2) {
    System.out.println(summand1 + " + " + summand2 + " = " + (summand1 + summand2));
  }
}
