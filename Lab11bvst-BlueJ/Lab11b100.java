// Lab11b100.java
// This is the Student starting version of the <Deck> class lab11b assignment. 


public class Lab11b100
{
    public static void main(String[] args)
    { 
      Deck deck = new Deck();
      deck.shuffle();
      System.out.println(deck.showCards());
    }
}


class Deck 
{
    private Card[] cards;
    private int size;

    public Deck() 
   {
      size = 52;
      cards = new Card[size];
      int counter = 0;
      String[] suit = {"Club","Spades","Hearts", "Diamonds"};
      String[] rank = {"Ace","Two", "Three", "Four", "Five", "Six",
          "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
      
      for (int i = 0; i < 4; i++) { //creates each suit
          for (int j = 0; j < 13; j++) { //creates each rank in suit
              Card temp = new Card(suit[i], rank[j], value[j]);
              temp.toString();
              cards[counter] = temp;
              counter++;
           }
    }
    }
   public void shuffle(){
       for (int i = 0; i < 52; i++){
           int random = (int)(Math.random() * 53);
           Card temp = cards[random];
           cards[random] = cards[i];
           cards[i] = temp;
        }
    }
   public String showCards(){
       String cardString = "";
       for (int i = 0; i < 52; i++) {
           cardString = cardString + "\n" + cards[i];
        }
        return cardString;
    }
 }
