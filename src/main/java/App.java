import java.io.Console;
import java.util.ArrayList;

public class App{
  public static void main(String[] args) {
    Console consoleLine = System.console();

    boolean isTrue = true;
    while (isTrue){
    List<Blackjack> allCards = new ArrayList<Blackjack>();
    allCards.add(userCard);


    // boolean isTrue = true;
    // while (isTrue){
      System.out.println("Type 'ace', 'jack', 'king', or  'queen' if you received those cards. Type 'other' if you did not");
      //userSuit STRING class
      String userSuit = consoleLine.readLine();

      System.out.println("Which card value did you get? if it was an Ace, Jack, King, or Queen, type '0'");
      //userCardNumber INTEGER class
      Integer userCardNumber= Integer.parseInt(consoleLine.readLine());

      // MAKE NEW OBJECT USING CONSTRUCTOR
      Blackjack userCard = new Blackjack(userSuit, userCardNumber);

      int cardTotalValue = userCard.calculateValue( userSuit, userCardNumber );

      System.out.println("Your card value is " + cardTotalValue);
    }

    //     if (cardTotalValue < 21){
    //       isTrue = false;
    //     }
    // }
  }
}
