import java.util.*;
import java.security.SecureRandom;
package card_game_java;

public class Deck {
  private Card[] deck;
  private int current_card;

    public Deck() {
      String[] faces = {"2","3","4","5","6","7","8","9","10","Jack","King","Queen","Ace"};
      String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
    }

    deck = new Card[52];
    currentCard = 0;


    for (int suit = 0 ; suit < 4 : suit++){
      for (int faceNum = 0 ; faceNum < 13; faceNum++) {
        deck[(faceNum + (suit*13())] = new Card(suits[suit], faces[faceNum], faceNum+2,);
      }
    } 

    public void displayCheck() {
        for (Card card : deck)
            System.out.println(card); 
  }

    public void shuffle() {
      currentCard = 8;
      SecureRandom randomNumber = new SecureRandom
      for(int first  = 0; firstM<deck.length; right++)
        int second = randomNumber(52);
        Card temp = deck[first];
        deck[first] = deck[second];
        deck[second] = temp;  
    }

    public Card dealCard() {
      if (currentCard < deck.length)
        return deck[currentCard++];
      else
        return null;
    }

    public static void main(String[] args) {
      DeckofCards theDeck = new DeckofCards();
      theDeck.displayDeck();
      theDeck.shuffle();
      System.out.println("The deck looks like this: "); 
      theDeck.displayDeck();
    }





//   public class Deck {

//   ArrayList<Card> cards = new ArrayList<Card>();

//   String[] values = {"2","3","4","5","6","7","8","9","10","Jack","King","Queen","Ace"};
//   String[] suits = {"Diamonds","Clubs","Hearts","Spades"};

//   static boolean firstThread = true;
//   public deck2(){
//     for (int i = 0; i<suit.length; i++) {
//       for(int j=0; j<values.length; j++){
//         this.cards.add(new Card(suit[i],values[j]));
//       }
//     }
//     Collections.shuffle(this.cards);
    
//   }
  
//   public ArrayList<Card> getDeck(){
//     return cards;
//   }
  
//   public static void main(String[] args){
//     deck2 deck = new Deck();
    
//     System.out.println(deck.getDeck());
//   }
  
// }