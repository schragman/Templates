package flyweight;

public class Terrorist implements Player{

  private String task;
  private Weapons weapon;

  public Terrorist() {
    this.task = "Plant the bomb";
  }

  @Override
  public void mission() {
    System.out.println("The weapon is " + weapon + " and the task is: " + task);
  }

  public void setWeapon(Weapons weapon) {
    this.weapon = weapon;
  }
}
