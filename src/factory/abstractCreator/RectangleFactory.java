package factory.abstractCreator;


public class RectangleFactory extends AbstractShapeFactory{

  public Shape factoryMethod() {
    return new Rectangle();
  }

}
