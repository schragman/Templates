package flyweight;

import java.util.Random;

public class CounterStrike {

  public static PlayerType getRandomPlayerType() {
    Random r = new Random();
    int random = r.nextInt(PlayerType.values().length);
    switch (random) {
      case 0:
        return PlayerType.terrorist;
      case 1:
        return PlayerType.counterterrorist;
      default:
        throw new IllegalStateException("Random number should be between 0 and 1");
    }
  }

  public static Weapons getRandomWeapon() {
    Random r = new Random();
    int random = r.nextInt(Weapons.values().length);
    switch (random) {
      case 0:
        return Weapons.arrow;
      case 1:
        return Weapons.gun;
      case 2:
        return Weapons.knive;
      case 3:
        return Weapons.pistol;
      default:
        throw new IllegalStateException("Random Weapon number should be between 0 and 3");
    }
  }

  public static void main(String[] args) {
    //Creating terrorists or counterterrorists
    PlayerFactory playerFactory = new PlayerFactory();
    for (int i = 0; i < 5; i++) {
      Player player = playerFactory.getPlayer(getRandomPlayerType());
      player.setWeapon(getRandomWeapon());
      player.mission();
    }
    System.out.println("\nEs gibt "+ playerFactory.getNumberOfPlayers()+" player objects");

  }

}
