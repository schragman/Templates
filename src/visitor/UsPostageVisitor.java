package visitor;

public class UsPostageVisitor implements VisitorInterface {
  private double totalPostage;
  private int totalPrice;
  @Override
  public void calculatePostage(Book book) {
    totalPostage += book.getWeight() * 2;
    totalPrice += book.getPrice();
  }

  @Override
  public void calculatePostage(Cd cd) {
    totalPostage += cd.getWeight() * 2.5;
    totalPrice += cd.getPrice();
  }

  @Override
  public void calculatePostage(Dvd dvd) {
    totalPostage += dvd.getWeight() * 3;
    totalPrice += dvd.getPrice();
  }

  @Override
  public double getTotalPostage() {
    return totalPrice >= 20 ? 0 :totalPostage;
  }
}
