package builder;

public class CarBuilder implements BuilderInterface{

  private Product product;

  public CarBuilder() {
    this.product = new Product();
  }

  @Override
  public void addBody() {
    product.add("Adding a new car body!");
  }

  @Override
  public void addWheels() {
    product.add("Adding 4 wheels");
  }

  @Override
  public void addHeadlights() {
    product.add("Adding two headlights");
  }

  @Override
  public Product getVehicle() {
    return product;
  }
}
