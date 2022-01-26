package chainOfResponsibility;

public class EmailError implements ErrorChain {

  ErrorChain next;

  @Override
  public void setNextChain(ErrorChain next) {
    this.next = next;
  }

  @Override
  public void handleError(Errors errors) {
    if (errors.getErrorText().contains("email")) {
      System.out.println(errors.getErrorPriority() + " " + errors.getErrorText());
    } else {
      next.handleError(errors);
    }
  }
}
