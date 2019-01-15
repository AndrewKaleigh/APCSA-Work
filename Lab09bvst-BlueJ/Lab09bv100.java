// Lab09bvst.java
// The Rational Class Program II
// This is the student, starting version of the Lab09b assignment.

import java.util.Scanner;

public class Lab09bv100
{
    private static int num1, den1;   // numerator and denominator of the 1st rational number
    private static int num2, den2;   // numerator and denominator of the 2nd rational number

    public static void main (String args[])
    {
        enterData();

        Rational r1 = new Rational(num1,den1);
        Rational r2 = new Rational(num2,den2);
        Rational r3 = new Rational();

        r3.multiply(r1,r2);
        System.out.println("\n\n" + r1.getOriginal() + " * " + r2.getOriginal() + "  =  " + r3.getReduced());
        r3.divide(r1,r2);
        System.out.println("\n" + r1.getOriginal() + " / " + r2.getOriginal() + "  =  " + r3.getReduced());

        
               r3.add(r1,r2);
               System.out.println("\n" + r1.getOriginal() + " + " + r2.getOriginal() + "  =  " + r3.getReduced());
               r3.subtract(r1,r2);
               System.out.println("\n" + r1.getOriginal() + " - " + r2.getOriginal() + "  =  " + r3.getReduced());
               System.out.println();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the 1st numerator ----> ");
        num1 = input.nextInt();
        System.out.print("\nEnter the 1st denominator --> ");
        den1 = input.nextInt();
        System.out.print("\nEnter the 2nd numerator ----> ");
        num2 = input.nextInt();
        System.out.print("\nEnter the 2nd denominator --> ");
        den2 = input.nextInt();
    }
}

class Rational
{
    private int firstNum;      // entered numerator
    private int firstDen;      // entered denominator
    private int reducedNum;     // reduced numerator
    private int reducedDen;     // reduced denominator
    private int gcf;           // greatest common factor
    
    public Rational(int num,int den){
     firstNum = num;
     firstDen = den;
     reducedNum = num;
     reducedDen = den;
    }
    
    public Rational(){
    }
    
    public int getNum(){
        return reducedNum;
    }
    
    public int getDen(){
        return reducedDen;
    }
    
    public String getReduced(){
		getGCF(firstNum,firstDen);
		reducedNum = firstNum / gcf;
		reducedDen = firstDen / gcf;
		return reducedNum + "/" + reducedDen;
    }
    		
    public String getOriginal(){
		return getNum() + "/" + getDen();
    }
    
    public void multiply(Rational r1,Rational r2){
        firstNum = r1.getNum() * r2.getNum();
        firstDen = r1.getDen() * r2.getDen(); 
    }
    
    public void divide(Rational r1, Rational r2){
        firstNum = r1.getNum() * r2.getNum();
        firstDen = r1.getDen() * r2.getNum();
    }
    
    public void add(Rational r1, Rational r2){
        firstNum = r1.getNum() + r2.getNum();
        firstDen = r1.getDen() + r2.getNum();
    }
    
    public void subtract(Rational r1, Rational r2){
        firstNum = r1.getNum() - r2.getNum();
        firstDen = r1.getDen() - r2.getNum();
    }
    
    private void getGCF(int n1,int n2)
    {
        int rem = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
    }

}

