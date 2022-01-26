package builder;

public class Client {

  public static void main(String[] args) {
    Director director = new Director();
    BuilderInterface carBuilder = new CarBuilder();

    director.createProduct(carBuilder);
    Product car = carBuilder.getVehicle();
    car.show();

    BuilderInterface motorcycleBuilder = new MotorcycleBuilder();
    director = new Director();
    director.createProduct(motorcycleBuilder);
    Product motorcycle = motorcycleBuilder.getVehicle();
    motorcycle.show();

  }
}
