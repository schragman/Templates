package bridge.challege;

public class Client {
  public static void main(String[] args) {
    Shape triangle = new Triangle(new GreenCircle());
    triangle.modifyBorder(20);

    System.out.println("Coloring triangle:");
    triangle.drawShapes();

    System.out.println("Now we change the border length 3 times");
    triangle.modifyBorder(60);
    triangle.drawShapes();

    System.out.println("\n");
    System.out.println("Coloring rectangle:");
    Shape rectangle = new Rectangle(new RedCircle());
    rectangle.modifyBorder(50);
    rectangle.drawShapes();
    System.out.println("Now we change the border length 2 times");
    rectangle.modifyBorder(100);
    rectangle.drawShapes();
  }
}
