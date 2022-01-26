package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

  private List<String> parts;

  public Product() {
    parts = new ArrayList<>();
  }

  public void add(String part) {
    parts.add(part);
  }

  public void show() {
    System.out.println("Show the parts");
    for (String part : parts) {
      System.out.println(part);
    }
  }

}
