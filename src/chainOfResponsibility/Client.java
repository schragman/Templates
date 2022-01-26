package chainOfResponsibility;

import java.util.Scanner;

public class Client {

  private ErrorChain e1 = new FaxError();
  private ErrorChain e2 = new EmailError();

  public Client() {
    e1.setNextChain(e2);
  }

  public static void main(String[] args) {
    Client errorHandler = new Client();

    while (true) {
      System.out.println("Enter an error priority 1-> high, 2 -> normal");
      Scanner input1 = new Scanner(System.in);
      int prio = input1.nextInt();
      if (prio != 1 && prio != 2) {
        System.out.println("Prio has to be 1 or 2!");
        return;
      }
      System.out.println("Enter error text");
      Scanner input2 = new Scanner(System.in);
      String errorText = input2.next();
      if (!errorText.contains("fax") && !errorText.contains("email")) {
        System.out.println("Error must either be email- or fax-error");
        return;
      }
      ErrorPriority errorPriority =
          prio == 1 ? ErrorPriority.highPriority : ErrorPriority.normalPriority;
      Errors error = new Errors(errorPriority, errorText);
      errorHandler.e1.handleError(error);
    }
  }


}
