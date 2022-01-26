package composite.challenge;

import java.util.List;

public class Professor implements CollegeItem {

  private ProfType profType;
  private String name;

  public Professor(ProfType profType, String name) {
    this.profType = profType;
    this.name = name;
  }

  @Override
  public void addChild(CollegeItem collegeItem) {
    throw new IllegalCallerException("Leaf cannot add child!");
  }

  @Override
  public void removeChild(CollegeItem collegeItem) {
    throw new IllegalCallerException("Leaf cannot remove child!");
  }

  @Override
  public void showDetails() {
    System.out.println(name+" is the " + profType.toString());
  }

  @Override
  public List<CollegeItem> getChildren() {
    throw new IllegalCallerException("Leaf has no children");
  }

}
