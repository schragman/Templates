package visitor;

public class SouthAmericaPostageVisitor implements VisitorInterface {
  private double totalPostage = 0.0;
  private int totalPrice = 0;

  @Override
  public void calculatePostage(Book book) {
    totalPostage += book.getWeight() * 4;
    totalPrice += book.getPrice();
  }

  @Override
  public void calculatePostage(Cd cd) {
    totalPostage += cd.getWeight() * 5;
    totalPrice += cd.getPrice();
    System.out.println();
  }

  @Override
  public void calculatePostage(Dvd dvd) {
    totalPostage += dvd.getWeight() * 6;
    totalPrice += dvd.getPrice();
  }

  @Override
  public double getTotalPostage() {
    return totalPrice>=30 ? 0 :this.totalPostage;
  }
}
