// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a100 assignment.


public class Lab04a100
{
	public static void main(String[] args)
	{
		System.out.println("Lab04a100, Student Version\n");
		double principal  = 250000;
		double annualRate = 0.0485;
		double monthlyRate = annualRate / 12;
		double numYears   = 30;
		double numMonths = numYears * 12;
		double rToMonthsPower = Math.pow((1 + monthlyRate), numMonths);
		double monthlyPayment = ((monthlyRate * rToMonthsPower)/(rToMonthsPower - 1)) *  principal;
		double totalPayment = monthlyPayment * 12 * 30;
		double totalInterest = totalPayment - principal;
		double displayRate = Math.round(annualRate * 10000);
		double rndMPay = Math.round(monthlyPayment * 100);
		double rndTPay = Math.round(totalPayment * 100);
		double rndTIntr = Math.round(totalInterest * 100);
		
		System.out.println("Principal: $"+ principal);
		System.out.println("Annual Rate: "+ displayRate/100 + "%");
		System.out.println("Number of Years: "+ numYears);
		System.out.println("monthlyPayment: $"+ rndMPay/100);
		System.out.println("Total Payments: $"+ rndTPay/100);
		System.out.println("Total Interest: $"+ rndTIntr/100);
	}
}


