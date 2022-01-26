package Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

  private static Map<String, Shape> shapeMap = new HashMap<>();

  public static void loadShapes() {
    //Loading Map e.g. database
    Shape circle = new Circle();
    circle.setId("1");
    shapeMap.put(circle.getId(), circle);
    Shape square = new Square();
    square.setId("2");
    shapeMap.put(square.getId(), square);
  }

  public static Shape getShape(String shapeId) {
    return (Shape) shapeMap.get(shapeId).clone();  //Otherwise it'll return Object
  }

}
