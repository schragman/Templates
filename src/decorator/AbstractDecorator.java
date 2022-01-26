package decorator;

public abstract class AbstractDecorator extends AbstractComponent{

  protected AbstractComponent component;

  public AbstractDecorator(AbstractComponent component) {
    this.component = component;
  }

  @Override
  public void doJob() {
    if (component != null) {
      component.doJob();
    }
  }
}
