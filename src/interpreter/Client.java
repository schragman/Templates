package interpreter;

public class Client {
  public static Expression getMaleExpression() {
    Expression john = new TerminalExpression("John");
    Expression tom = new TerminalExpression("Tom");
    return new OrExpression(john, tom);
  }

  public static Expression getMarriedExpression() {
    Expression juli = new TerminalExpression("Juli");
    Expression married = new TerminalExpression("married");
    return new AndExpression(juli, married);
  }

  public static void main(String[] args) {
    Context c1 = new Context("John");
    System.out.println("Is John male? " + getMaleExpression().interpret(c1));

    Context c2 = new Context("Juli married");
    System.out.println("Is Juli married? " + getMarriedExpression().interpret(c2));
  }

}
