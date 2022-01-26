package proxy;

public class InternetConnection implements Internet {

  @Override
  public String request(String host) {
    return ("This is the answer of the host " + host);
  }

}
