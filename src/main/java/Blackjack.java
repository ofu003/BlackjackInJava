public class Blackjack{
  //DEFINE BEHAVIOR , ATTRIBUTES
  public String mSuit;
  public int mValue;

  // CONSTRUCTOR
  public Blackjack(String suit, int value){
    mSuit=suit;
    mValue=value;
  }

  public int calculateValue(String suit, int value){
    int cardValueSuit=0;
    int cardValueNumber=0;

    if (suit.equals("other")){
      cardValueSuit = 0;
      cardValueNumber=value;
    }
    else if (suit.equals("queen") ||suit.equals("king") ||suit.equals("jack")) {
      cardValueSuit = 10;
      cardValueNumber = 0;
    }
    else if (suit.equals("ace")){
      cardValueSuit = 11;
      cardValueNumber=0;
    }
    else {
    }
    int totalValue = cardValueSuit + cardValueNumber;
    // System.out.println(cardValueSuit);
    // System.out.println(cardValueNumber);
    // System.out.println(totalValue);

    return totalValue;

  }

  // SOMETHING WE CREATED TO BE CALLED FOR THE FIRST FAIL
  public String getSuit(){
    return mSuit;
  }
}
