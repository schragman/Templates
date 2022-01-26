package state;

public class Silent implements HandyMode {

  @Override
  public void ring() {
    System.out.println("I am silent...");
  }
}
