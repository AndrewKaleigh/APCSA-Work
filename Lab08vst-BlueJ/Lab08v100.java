// Lab08v100.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08v100
{
    public static void main (String[] args)
    {
      Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            str = str.toLowerCase();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));   // used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        }
        while (notFinished);
    }
}



class Palindrome
{
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
     */
    public static boolean isPal(String s)
    {
      boolean tf = false;
      int counter = 1;
      int l = s.length(); // length of string
      String rev = "";
      while (counter <= l){
          rev = rev + s.substring(l-counter, (l - counter)+1);
          counter++;
        }
        if (rev.equals(s))
            tf = true;
        return tf;
    }  
   
   /*
     * Precondition:  s is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
   private static boolean isLetter(String s)
   {
      String[] badChars = new String[] {".",",","/","&","-","_","*","!","^"};
      int i=0;
      boolean tf = true;
      for(i=0;i<badChars.length; i++){
        if(s.equals(badChars[i])){
        return false;
    }
    }
    return true;
   }
   
    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static String purge(String s)
    {
      int counter = 0;
      s.trim();
      String newS = "";
      boolean tf = false;
      while(counter != s.length()){
         tf = isLetter(s.substring(counter,counter + 1));
         if (tf)
            newS = newS + s.substring(counter,counter + 1);
         counter++;
         tf = false;
        }
      return newS;
    }
   
   /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
      String newS = purge(s);
      return isPal(newS);
    }

}

