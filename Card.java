public class Card {
             
private String faceName; suit;
private int faceValue;
       
       
public Card(String suit, String face, int value){
     this.suit = suit; 
     this.faceName = face;
     faceValue = value;
}

public String toString() {
   return faceName + " " + suits;
}

public int getFaceValue(){
        return faceValue;
}

}