package momento;

public class Originator {
  private String state;

  public Momento saveState() {
    return new Momento(this.state);
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setOldState(Object oldState) {
    this.state = ((Momento) oldState).getState();
  }

  @Override
  public String toString() {
    return this.state;
  }

  private class Momento {
    private String state;

    public Momento(String state) {
      this.state = state;
    }

    public String getState() {
      return state;
    }
  }

}
