package visitor;

public interface VisitorInterface {
  void calculatePostage(Book book);

  void calculatePostage(Cd cd);

  void calculatePostage(Dvd dvd);

  double getTotalPostage();
}
