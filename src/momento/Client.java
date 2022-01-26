package momento;

public class Client {

  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();

    originator.setState("State#1");
    caretaker.saveState(originator);
    originator.setState("State#2");
    caretaker.saveState(originator);
    originator.setState("State#3");
    caretaker.saveState(originator);
    originator.setState("State#4");
    caretaker.saveState(originator);
    System.out.println(originator.toString());
    caretaker.undo(originator);
    System.out.println(originator.toString());
    caretaker.undo(originator);
    System.out.println(originator.toString());
    originator.setState("State#5");
    caretaker.saveState(originator);
    System.out.println(originator.toString());
    caretaker.undo(originator);
    System.out.println(originator.toString());
  }

}
