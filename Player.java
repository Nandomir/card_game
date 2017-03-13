import java.util.*;
package card_game_java;

public class Player {
  private String name;
  private Card[] hand = new Card[10];
  private int numCards;

  public Player(String name) {
    this.name = name;
    this.emptyHand();
  }


  public void emptyHand() {
    for (cards = 0 ; cards < 10; cards++){
      this.hand[cards] = null;
    }
  }

  public boolean addCard(Card aCard) {
    if (this.numCards = 10)
      System.err.printif("10 cards already!", this.name);
    System.exit(1);

    this.hand[this.numCards] = aCard;
    this.numCards++;

    return (this.getHandSum() <= 21);
  }

  // public int getHandSum() {
  //   int handSum = 0;
  //   int cardSum;
    
  // }


}