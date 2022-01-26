package Prototype;

public class Client {

  public static void main(String[] args) {
    ShapeCache.loadShapes();

    Shape clonedShape = ShapeCache.getShape("1");

    clonedShape.draw();

  }

}
