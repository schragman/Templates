package factory.abstractCreator;


public class CircleFactory extends AbstractShapeFactory{

  protected Shape factoryMethod() {
    return new Circle();
  }

}
