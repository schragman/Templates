package abstractFactory.challenge;

public class MovieFactoryProducer {

  public static AbstractMovieFactory getMovieFactory(String factoryType) {
    if (null == factoryType) {
      return null;
    } else if (factoryType.equalsIgnoreCase("hollywood")) {
      return new HollywoodMovieFactory();
    } else if (factoryType.equalsIgnoreCase("bollywood")) {
      return new BollywoodMovieFactory();
    }
    return null;
  }

}
