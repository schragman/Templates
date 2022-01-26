package factory.challenge;

public class AnimalFactory {

  public static Animal getAnimalType(String animal) {
    if (animal == null) {
      return null;
    } else if (animal.equalsIgnoreCase("DUCK")) {
      return new Duck();
    } else if (animal.equalsIgnoreCase("TIGER")) {
      return new Tiger();
    }
    return null;
  }

}
