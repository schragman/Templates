package neuland;

public class Test {

  //List<Integer> testliste = new ArrayList<>();

  public boolean containsZahl(int[] testliste, int testZahl) {

    if (testliste.length < 2) {
      if(testliste.length == 0)
        return false;
      else if (testliste[0] == testZahl) {
        return true;
      }
    }

    int anfang = testliste.length / 2;

    if (testliste[anfang] == testZahl) {
      return true;
    } else if (testZahl < testliste[anfang]) {
      return containsZahl(testliste, testZahl);
    } else {
      return containsZahl(testliste, testZahl);
    }



  }

}
