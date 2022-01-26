package bridge;

public class Client {

  public static void main(String[] args) {

    Vehicle car = new Car(new Produce(), new Assembly());
    car.manufacture();

    Vehicle bike = new Bike(new Produce(), new Assembly());
    bike.manufacture();

  }

}
