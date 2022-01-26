package composite.challenge;

public class Client {
  public static void main(String[] args) {
    CollegeItem dean = new Supervisor(" is the dean of technology", "Dr. S.Som");
    CollegeItem chair1 = new Supervisor(" is the chair of Math Department", "Mrs.S.DAS");
    CollegeItem chair2 = new Supervisor(" is the chair of Computer Science Department", "Mr. V.Sarcar");
    CollegeItem ma1 = new Professor(ProfType.Adjunct, "Math Professor1");
    CollegeItem ma2 = new Professor(ProfType.Associate, "Math Professor2");
    CollegeItem cse1 = new Professor(ProfType.Adjunct, "CSE Professor1");
    CollegeItem cse2 = new Professor(ProfType.Professor, "CSE Professor2");
    CollegeItem cse3 = new Professor(ProfType.Professor, "CSE Professor3");

    chair1.addChild(ma1);
    chair1.addChild(ma2);

    chair2.addChild(cse1);
    chair2.addChild(cse2);
    chair2.addChild(cse3);

    dean.addChild(chair1);
    dean.addChild(chair2);

    dean.showDetails();
    for (CollegeItem chair : dean.getChildren()) {
      System.out.print("\t");
      chair.showDetails();
    }

    for (CollegeItem mathProfessors : chair1.getChildren()) {
      System.out.print("\t\t");
      mathProfessors.showDetails();
    }

    for (CollegeItem mathProfessors : chair2.getChildren()) {
      System.out.print("\t\t");
      mathProfessors.showDetails();
    }


  }
}
