package factory.abstractCreator;

public class Client {

  public static void main(String[] args) {

    Shape shape1 = new CircleFactory().getShape();
    shape1.draw();

    Shape rec = new RectangleFactory().getShape();
    rec.draw();

  }

}
