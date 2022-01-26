package bridge.challege;

public class Rectangle extends Shape {

  public Rectangle(IColor color) {
    super(color);
  }

  public void modifyBorder(int newBorder) {
    this.border = newBorder;
  }

  public void drawShapes() {
    System.out.print("This Rectangle is colored with: ");
    color.fillWithColor(this.border);
  }

}
