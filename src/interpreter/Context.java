package interpreter;

public class Context {
  private String data;

  public Context(String data) {
    this.data = data;
  }

  public boolean getResult(String input) {
    return data.contains(input);
  }

}
