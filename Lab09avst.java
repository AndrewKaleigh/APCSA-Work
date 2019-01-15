// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.
//REAL

import java.util.Scanner;


public class Lab09avst
{
	private static int num, den;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(num,den);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		num = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		den = input.nextInt();
	}
}



class Rational
{
	private int rNum;
	private int rDen;
	private int gcf;
	private int firstNum;
	private int firstDen;
	
	public Rational(int num, int den){
		rNum = num;
		firstNum = num;
		rDen = den;
		firstDen = den;
	}
	
	public int getNum(){
		return firstNum;
		}
		
	public int getDen(){
		return firstDen;
		}
		
	public float getDecimal(){
		return (firstNum / firstDen);
		}
		
	public String getReduced(){
		getGCF(rNum,rDen);
		rNum = rNum / gcf;
		rDen = rDen /gcf;
		return rNum + "/" + rDen;
		}
	
	public String getOriginal(){
		return getNum() + "/" + getDen();
	}
	
	
	public void displayData(){
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
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









