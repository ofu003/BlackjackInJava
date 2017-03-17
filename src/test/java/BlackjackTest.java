import org.junit.*;
import static org.junit.Assert.*;

public class BlackjackTest {

  @Test
  public void getSuit_returnTheRightSuit_Spades(){
    Blackjack blackjack = new Blackjack("spades", 10);
    assertEquals("spades", blackjack.mSuit);
  }

}
