package abstractFactory.challenge;

public abstract class AbstractMovieFactory {

  public abstract BollywoodMovie getBollywoodMovie(String movieType);

  public abstract HollywoodMovie getHollywoodMovie(String movieType);

}
