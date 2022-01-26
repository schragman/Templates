package factory.concreteCreator;

public class Client {

  public static void main(String[] args) {

    Shape shape1 = new ShapeFactory().getShape("circle");
    shape1.draw();

    Shape rec = new ShapeFactory().getShape("rectangle");
    rec.draw();

  }

}
