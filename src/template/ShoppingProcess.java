package template;

import java.util.Scanner;

//template
public abstract class ShoppingProcess {
  private boolean giftPreference;

  public final void processShopping() {
    this.addItem();
    this.setGiftPreference();
    this.getDeliveryAdress();
    this.doPayment();
    this.provideWrappingStatus();
    this.provideDeliveryStatus();
  }

  protected abstract void addItem();

  private void setGiftPreference() {
    System.out.println("Do you need gift wrapping? (Y/N)");
    Scanner scn = new Scanner(System.in);
    String answer = scn.next();
    this.giftPreference = answer.equalsIgnoreCase("y");
  }

  protected abstract void getDeliveryAdress();

  protected abstract void doPayment();

  private void provideWrappingStatus() {
    if (giftPreference) {
      System.out.println("Gift wrap successful");
    }
  }

  protected abstract void provideDeliveryStatus();


}
