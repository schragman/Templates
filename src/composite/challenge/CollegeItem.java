package composite.challenge;

import java.util.List;

public interface CollegeItem {

  void addChild(CollegeItem collegeItem);

  void removeChild(CollegeItem collegeItem);

  void showDetails();

  List<CollegeItem> getChildren();

}
