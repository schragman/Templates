package decorator;

public class ConcreteDecorator extends AbstractDecorator{

  public ConcreteDecorator(AbstractComponent component) {
    super(component);
  }

  @Override
  public void doJob() {
    System.out.println("!!!!!!!!!!Hier wird vorher dekoriert!!!!!!!!!!!!");
    super.doJob();
    System.out.println("!!!!!!!!!!Hier wird nachher dekoriert!!!!!!!!!!!");
  }

}
