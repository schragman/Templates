package chainOfResponsibility;

public class FaxError implements ErrorChain {

  ErrorChain next;

  @Override
  public void setNextChain(ErrorChain next) {
    this.next = next;
  }

  @Override
  public void handleError(Errors errors) {
    if (errors.getErrorText().contains("fax")) {
      System.out.println(errors.getErrorPriority() + " " + errors.getErrorText());
    } else {
      next.handleError(errors);
    }
  }
}
