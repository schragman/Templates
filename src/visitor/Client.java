package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

  private static List<Element> fillItems() {
    List<Element> result = new ArrayList<>();
    result.add(new Book(5, 0.5));
    result.add(new Dvd(15, 0.1));
    result.add(new Cd(10, 0.1));
    return result;
  }

  public static void main(String[] args) {
    List<Element> items = fillItems();
    VisitorInterface usPostage = new UsPostageVisitor();
    VisitorInterface saPostage = new SouthAmericaPostageVisitor();

    for (Element item : items) {
      item.accept(usPostage);
    }
    System.out.println("The shipping within the US costs " + usPostage.getTotalPostage());

    System.out.println("***************");

    for (Element item : items) {
      item.accept(saPostage);
    }
    System.out.println("The shipping to South America costs " + saPostage.getTotalPostage());
  }
}
