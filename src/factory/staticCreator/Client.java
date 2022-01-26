package factory.staticCreator;

public class Client {

  public static void main(String[] args) {

    Shape shape1 = ShapeFactory.getShape("Circle");
    shape1.draw();

    Shape rec = ShapeFactory.getShape("rectangle");
    rec.draw();

  }

}
