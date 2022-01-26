package strategy;

public class Client {
  public static void main(String[] args) {
    Strategy plus = new Addition();
    Strategy minus = new Substraction();
    Strategy mal = new Multiplication();

    Context calcualator = new Context();
    calcualator.setOp1(10);
    calcualator.setOp2(5);

    calcualator.doOperation(plus);
    calcualator.doOperation(minus);
    calcualator.doOperation(mal);

  }
}
