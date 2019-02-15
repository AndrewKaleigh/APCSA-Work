import java.util.Scanner;


public class Lab11av100
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        int index = 0;
        System.out.println("ENTER UPPER PRIME NUMBER LIMIT:");
        Scanner input = new Scanner(System.in);
        index = input.nextInt();
        final int MAX = index;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes, MAX);
        displayPrimes(primes);
    }

    public static void computePrimes( boolean primes[],int length)
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        int list[];
        list = new int[length];
        for(int i = 2; i < length; i++){  //sets up a list of numbers
            list[i] = i;
            primes[i] = true;
        }
        for(int i = 2; i < length; i++){ //computes prime
            int checkerNum;
            checkerNum = list[i];
            System.out.print(" " + checkerNum + " ");
            for(int index = i+i; index < length; index += i){
                   primes[index] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        int list[];
        int counter = 0;
        int primesPerLine = 10;
        list = new int[primes.length];
        for(int i = 2; i < primes.length; i++){  //sets up a list of numbers
            list[i] = i;
        }
        for(int i = 2; i < primes.length; i++){  //sets up a list of numbers
            if(counter % primesPerLine == 0){
                System.out.println();
            }
            if(primes[i]){
                if(list[i] < 10){
                    System.out.print("0"+list[i]+" ");
                    counter++;
                }
                else{
                    System.out.print(list[i]+ " ");
                    counter++;
                }
            }
        }
        }     
    }



