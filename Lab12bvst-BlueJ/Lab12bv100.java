// Lab12bv100.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.



import java.util.ArrayList;

public class Lab12bv100
{
    public static void main(String[] args)
    {   
      System.out.println("..........");
      Deck deck = new Deck();
      deck.shuffleOneHundredPoint();
      System.out.println(deck.print());
    }
}


class Deck 
{
    private ArrayList<Card> cards;
    private int size;

    public Deck() 
   {
      size = 52;
      cards = new ArrayList<Card>();
      int counter = 0;
      String[] suit = {"Club","Spades","Hearts", "Diamonds"};
      String[] rank = {"Ace","Two", "Three", "Four", "Five", "Six",
          "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
      int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};

      for (int i = 0; i < 4; i++) { //creates each suit
          for (int j = 0; j < 13; j++) { //creates each rank in suit
              Card temp = new Card(suit[i], rank[j], value[j]);
              cards.add(temp);
              counter++;
           }
    }
    } 
   /*  public void shuffleNinetyPoint()
   {
        for(int k = 0; k < 1000; k++){
            int random1 = (int)(Math.random() * 52);
            int random2 = (int)(Math.random() * 52);
            Card temp = cards.get(random1);
            cards.set(random1,cards.get(random2));
            cards.set(random2,temp);
        } 
    }*/
     public void shuffleOneHundredPoint()
   {
        for(int k = 0; k < 52; k++){
            int random = (int)(Math.random() * 52);
            Card temp = cards.get(k);
            cards.add(random + 1,temp);
            cards.remove(k);
        }
    }
    public String print()
   {
       String cardString = "";
       for (int i = 0; i < 52; i++) {
           cardString = cardString + "\n" + cards.get(i);
        }
        return cardString;
   }
 }
