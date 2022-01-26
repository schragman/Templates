package factory.concreteCreator;


public class ShapeFactory {

  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    return null;
  }
}
