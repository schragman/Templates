package momento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  private List<Object> states;
  private int currentItem;

  public Caretaker() {
    this.states = new ArrayList<>();
    currentItem = 0;
  }

  public void saveState(Originator originator) {
    Object state = originator.saveState();
    this.states.add(state);
    currentItem = states.size();
  }

  public void undo(Originator originator) {
    if (currentItem == 0) {
      System.out.println("no item saved!");
    } else {
      currentItem--;
      originator.setOldState(states.get(currentItem-1));
    }
  }

}
