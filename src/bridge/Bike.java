package bridge;

public class Bike extends Vehicle {

  public Bike(Workshop w1, Workshop w2) {
    super(w1, w2);
  }

  public void manufacture() {
    System.out.println("Bike ");
    workshop1.work();
    workshop2.work();
  }

}
