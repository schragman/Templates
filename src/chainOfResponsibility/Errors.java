package chainOfResponsibility;

public class Errors {
  private ErrorPriority errorPriority;
  private String errorText;

  public Errors(ErrorPriority errorPriority, String errorText) {
    this.errorPriority = errorPriority;
    this.errorText = errorText;
  }

  public ErrorPriority getErrorPriority() {
    return errorPriority;
  }

  public String getErrorText() {
    return errorText;
  }
}
