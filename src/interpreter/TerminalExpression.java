package interpreter;

public class TerminalExpression implements Expression {

  private String input;

  public TerminalExpression(String input) {
    this.input = input;
  }

  @Override
  public boolean interpret(Context context) {
    return context.getResult(input);
  }

}
