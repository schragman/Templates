package bridge.challege;

public class Triangle extends Shape {

  public Triangle(IColor color) {
    super(color);
  }

  public void modifyBorder(int newBorder) {
    this.border = newBorder;
  }

  public void drawShapes() {
    System.out.print("This Triangle is colored with: ");
    color.fillWithColor(this.border);
  }

}
