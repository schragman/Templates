package abstractFactory.challenge;

public class HollywoodMovieFactory extends AbstractMovieFactory {

  @Override
  public HollywoodMovie getHollywoodMovie(String movieType) {
    if (null == movieType) {
      return null;
    } else if (movieType.equalsIgnoreCase("action")) {
      return new HollywoodActionMovie();
    } else if (movieType.equalsIgnoreCase("comedy")) {
      return new HollywoodComedyMovie();
    }
    return null;
  }

  @Override
  public BollywoodMovie getBollywoodMovie(String movieType) {
    return null;
  }

}
