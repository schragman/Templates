package observer;

public class Subscriber implements Observer {

  private String name;

  public Subscriber(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void update(Object obj) {
    System.out.println(this.name + " is consuming Message: " + (String) obj);
  }
}
