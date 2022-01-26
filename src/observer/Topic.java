package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
  private List<Observer> observers;
  private String message;
  private boolean changed;

  public Topic() {
    this.observers = new ArrayList<>();
    this.changed = false;
  }

  @Override
  public void register(Observer observer) {
    if (observer != null && !observers.contains(observer)) {
      observers.add(observer);
    }
  }

  @Override
  public void unregister(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    if (changed) {
      changed = false;
      List<Observer> currentObservers = new ArrayList<>(observers);
      for (Observer observer : currentObservers) {
        observer.update(message);
      }
    }
  }

  //If subject is updated
  @Override
  public void update(String message) {
    this.message = message;
    this.changed = true;
    this.notifyObservers();
  }

}
