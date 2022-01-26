package proxy;

public class Client {

  public static void main(String[] args) throws IllegalAccessException{
    Internet internet = new InternetProxy();

    System.out.println("Calling the legal site www.michael-schrage.de/LearningApp");
    System.out.println(internet.request("www.michael-schrage.de/LearningApp"));
    System.out.println("\nCalling the illegal site www.doNotGoThere.com");
    System.out.println(internet.request("www.doNotGoThere.com"));
  }

}
