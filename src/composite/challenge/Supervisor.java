package composite.challenge;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements CollegeItem {

  private List<CollegeItem> children;
  private String position;
  private String name;

  public Supervisor(String position, String name) {
    this.position = position;
    this.name = name;
    this.children = new ArrayList<>();
  }

  @Override
  public void addChild(CollegeItem professor) {
    this.children.add(professor);
  }

  @Override
  public void removeChild(CollegeItem professor) {
    this.children.remove(professor);
  }

  @Override
  public void showDetails() {
    System.out.println(name + position);
  }

  @Override
  public List<CollegeItem> getChildren() {
    return this.children;
  }

}
