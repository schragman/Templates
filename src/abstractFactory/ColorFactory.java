package abstractFactory;

public class ColorFactory extends AbstractFactory{

  @Override
  public Color getColor(String colorType) {
    if (colorType == null) {
      return null;
    } else if (colorType.equalsIgnoreCase("red")) {
      return new Red();
    } else if (colorType.equalsIgnoreCase("Blue")) {
      return new Blue();
    }
    return null;
  }

  @Override
  public Shape getShape(String shapeType) {
    return null;
  }

}
