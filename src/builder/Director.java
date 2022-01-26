package builder;

public class Director {

  private BuilderInterface builderInterface;

  public void createProduct(BuilderInterface builderInterface) {
    this.builderInterface = builderInterface;
    builderInterface.addBody();
    builderInterface.addHeadlights();
    builderInterface.addWheels();
  }

}
