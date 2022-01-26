package visitor;

public class Cd implements Element{
  private int price;
  private double weight;

  public Cd(int price, double weight) {
    this.price = price;
    this.weight = weight;
  }

  @Override
  public void accept(VisitorInterface visitor) {
    visitor.calculatePostage(this);
  }

  public int getPrice() {
    return price;
  }

  public double getWeight() {
    return weight;
  }
}
