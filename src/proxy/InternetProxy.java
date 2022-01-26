package proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

  private List<String> blacklist = new ArrayList<>();
  private Internet internetConnection;

  public InternetProxy() {
    blacklist.add("www.doNotGoThere.com");
    blacklist.add("www.pleaseLeave.com");
    internetConnection = new InternetConnection();
  }

  @Override
  public String request(String host) throws IllegalAccessException{
    if (blacklist.contains(host)) {
      throw new IllegalAccessException(host + " is not allowed here!");
    }
    return this.internetConnection.request(host);
  }

}
