package factory.challenge;

public class Client {
  public static void main(String[] args) {
    Animal duck = AnimalFactory.getAnimalType("duck");
    Animal tiger = AnimalFactory.getAnimalType("tiger");

    duck.talk();
    tiger.talk();
  }
}
