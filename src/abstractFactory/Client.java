package abstractFactory;

public class Client {
  public static void main(String[] args) {
    AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
    Shape circle = shapeFactory.getShape("circle");
    circle.draw();

    AbstractFactory colorFactory = FactoryProducer.getFactory("color");
    Color red = colorFactory.getColor("red");
    red.fill();
  }
}
