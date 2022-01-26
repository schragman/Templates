package abstractFactory.challenge;


public class Client {

  public static void main(String[] args) {
    AbstractMovieFactory hollywoodmovieFactory = MovieFactoryProducer.getMovieFactory("hollywood");
    HollywoodMovie hollywoodActionMovie = hollywoodmovieFactory.getHollywoodMovie("action");
    HollywoodMovie hollywoodComedyMovie = hollywoodmovieFactory.getHollywoodMovie("comedy");

    System.out.println(hollywoodActionMovie.getMovieName());
    System.out.println(hollywoodComedyMovie.getMovieName());

    AbstractMovieFactory bollywoodmovieFactory = MovieFactoryProducer.getMovieFactory("bollywood");
    BollywoodMovie bollywoodActionMovie = bollywoodmovieFactory.getBollywoodMovie("action");
    BollywoodMovie bollywoodComedyMovie = bollywoodmovieFactory.getBollywoodMovie("comedy");

    System.out.println(bollywoodActionMovie.getMovieName());
    System.out.println(bollywoodComedyMovie.getMovieName());

  }

}
