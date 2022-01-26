package chainOfResponsibility;

public interface ErrorChain {
  void setNextChain(ErrorChain nextChain);

  void handleError(Errors errors);
}
