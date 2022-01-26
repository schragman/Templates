package command;

//Receiver class
public class Stock {
  private int quantity;
  private String name;

  public Stock(int quantity, String name) {
    this.quantity = quantity;
    this.name = name;
  }

  public void buy() {
    System.out.println("Bought [" + name + "]: " + quantity + " pieces.");
  }

  public void sell() {
    System.out.println("Sold [" + name + "]: " + quantity + " pieces.");
  }
}
