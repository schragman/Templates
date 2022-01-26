package strategy;

public class Context {
  private int op1, op2;

  public void setOp1(int op1) {
    this.op1 = op1;
  }

  public void setOp2(int op2) {
    this.op2 = op2;
  }

  public void doOperation(Strategy calculation) {
    calculation.performOperation(op1, op2);
  }
}
