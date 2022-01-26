package state;

//Context
public class MobilePhone {
  private HandyMode state;

  public MobilePhone(HandyMode state) {
    this.state = state;
  }

  public void setState(HandyMode state) {
    this.state = state;
  }

  public void ring() {
    this.state.ring();
  }
}
