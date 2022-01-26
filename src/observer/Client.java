package observer;

public class Client {
  public static void main(String[] args) {
    Observer[] observers = new Observer[3];
    Subject topic = new Topic();
    observers[0] = new Subscriber("Obs1");
    observers[1] = new Subscriber("Obs2");
    observers[2] = new Subscriber("Obs3");

    for (int i = 0; i < observers.length; i++) {
      topic.register(observers[i]);
    }

    topic.update("1. Nachricht");
    topic.update("2. Nachricht");
  }
}
