package factory.abstractCreator;

public abstract class AbstractShapeFactory {

  protected abstract Shape factoryMethod();

  public Shape getShape() {
    return factoryMethod();
  }

}
