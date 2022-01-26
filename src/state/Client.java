package state;

public class Client {

  public static void main(String[] args) {
    HandyMode initialState = new Vibration();
    MobilePhone mobilePhone = new MobilePhone(initialState);

    mobilePhone.ring();

    mobilePhone.setState(new Silent());
    mobilePhone.ring();
  }

}
