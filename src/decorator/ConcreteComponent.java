package decorator;

public class ConcreteComponent extends AbstractComponent {

  @Override
  public void doJob() {
    System.out.println("I am the Component and do the job!");
  }

}
