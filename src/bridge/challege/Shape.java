package bridge.challege;

public abstract class Shape {

  protected IColor color;
  protected int border;

  public Shape(IColor color) {
    this.border = 1;
    this.color = color;
  }

  public abstract void drawShapes();

  public abstract void modifyBorder(int newBorder);

}
