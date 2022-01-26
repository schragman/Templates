package decorator;

public class Client {
  public static void main(String[] args) {
    AbstractComponent c = new ConcreteComponent();
    AbstractDecorator decorator = new ConcreteDecorator(c);
    c.doJob();

    decorator.doJob();
  }
}
