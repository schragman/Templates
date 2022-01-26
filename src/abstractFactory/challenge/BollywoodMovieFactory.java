package abstractFactory.challenge;

public class BollywoodMovieFactory extends AbstractMovieFactory {

  @Override
  public BollywoodMovie getBollywoodMovie(String movieType) {
    if (null == movieType) {
      return null;
    } else if (movieType.equalsIgnoreCase("action")) {
      return new BollywoodActionMovie();
    } else if (movieType.equalsIgnoreCase("comedy")) {
      return new BollywoodComedyMovie();
    }
    return null;
  }

  @Override
  public HollywoodMovie getHollywoodMovie(String movieType) {
    return null;
  }

}
