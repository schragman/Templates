package builder;

public class MotorcycleBuilder implements BuilderInterface{

  private Product product;

  public MotorcycleBuilder() {
    this.product = new Product();
  }

  @Override
  public void addBody() {
    product.add("Adding a new motorcycle body!");
  }

  @Override
  public void addWheels() {
    product.add("Adding 2 wheels");
  }

  @Override
  public void addHeadlights() {
    product.add("Adding one headlight");
  }

  @Override
  public Product getVehicle() {
    return product;
  }
}
