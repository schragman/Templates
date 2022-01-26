package abstractFactory;

public class ShapeFactory extends AbstractFactory{

  @Override
  public Color getColor(String colour) {
    return null;
  }

  @Override
  public Shape getShape(String shapeType) {
    if (shapeType == null) {
      return null;
    } else if (shapeType.equalsIgnoreCase("Circle")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("Rectangle")) {
      return new Rectangle();
    }
    return null;
  }

}
