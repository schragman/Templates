package flyweight;

public class CounterTerrorist implements Player{

  private String task;
  private Weapons weapon;

  public CounterTerrorist() {
    this.task = "diffuse the bomb";
  }

  @Override
  public void mission() {
    System.out.println("The weapon is " + weapon + " and the task is: " + task);
  }

  public void setWeapon(Weapons weapon) {
    this.weapon = weapon;
  }
}
