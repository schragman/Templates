package flyweight;

import java.util.HashMap;

public class PlayerFactory {

  private HashMap<PlayerType, Player> players;

  public PlayerFactory() {
    players = new HashMap<>();
  }

  public Player getPlayer(PlayerType playerType) {
    Player returnPlayer = null;
    if (players.containsKey(playerType)) {
      returnPlayer = players.get(playerType);
    } else {
      switch (playerType) {
        case terrorist:
          returnPlayer = new Terrorist();
          players.put(playerType, returnPlayer);
          break;
        case counterterrorist:
          returnPlayer = new CounterTerrorist();
          players.put(playerType, returnPlayer);
          break;
        default:
          throw new IllegalStateException("No such Playertype: " + playerType);
      }
    }
    return returnPlayer;
  }

  public int getNumberOfPlayers() {
    return players.size();
  }

}
