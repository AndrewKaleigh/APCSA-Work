// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15avst
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
        magic.checkRows();          // for 100 & 110 Point Version Only
        magic.checkColumns();        // for 100 & 110 Point Version Only
        magic.checkDiagonals();      // for 100 & 110 Point Version Only
    }
}

class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
    }

    public void computeMagicSquare()
    {
        int topmid = size/2;
        int x = topmid;
        int y = 0;
        int counter = 2;
        magic[topmid][0] = 1;
        while(counter != size*size+1){
            int dropY;
            int previousX = x;
            int previousY = y;
            x = x + 1;
            y = y - 1;
            if(y == -1)
                y = size-1;
            if(x == size)
                x = 0;
            if(magic[x][y] > 0){
                if(previousY == size -1){
                    dropY = 0;
                } else {
                    dropY = previousY + 1;
                }
                magic[previousX][dropY] = counter;
                x = previousX;
                y = dropY;
            } else {
                magic[x][y] = counter;
            }
            ++counter; 
        }
    }

    public void displayMagicSquare()
    {
        int counterX = 0;
        int counterY = 0;
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");
        System.out.println();
        while(counterY != size){
            while(counterX != size){
                System.out.print(toString(magic[counterX][counterY]) + " ");
                ++counterX;
            }
            System.out.println();
            counterX = 0;
            ++counterY;
        }
    }

    public static String toString(int i)
    {
        DecimalFormat output = new DecimalFormat("000");
        String str = output.format(i);
        return str;
    }

    public void checkRows()
    {
        int sum = 0;
        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("=============");
        System.out.println();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sum = sum + magic[j][i];
                if(j + 1 == size)
                    System.out.print(toString(magic[j][i]));
                else
                    System.out.print(toString(magic[j][i]) + " + ");
            }
            System.out.println(" = " + toString(sum));
            sum = 0;
        }
    }

    public void checkColumns()
    {
        int sum = 0;
        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("=============");
        System.out.println();
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sum = sum + magic[i][j];
                if(j + 1 == size)
                    System.out.print(toString(magic[i][j]));
                else
                    System.out.print(toString(magic[i][j]) + " + ");
            }
            System.out.println(" = " + toString(sum));
            sum = 0;
        }
    }

    public void checkDiagonals()
    {
        int sumLtoR = 0;
        int sumRtoL = 0;
        int x = 0;
        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("=============");
        System.out.println();
        for(int i = 0; i < size; i++){
            sumLtoR += magic[i][i];
            if(i + 1 == size)
                System.out.print(toString(magic[i][i]));
            else
                System.out.print(toString(magic[i][i]) + " + ");
        }
        System.out.println(" = " + toString(sumLtoR));
        for(int y = size -1; y >= 0; y--){
            sumRtoL += magic[x][y];
            if(x + 1 == size)
                System.out.print(toString(magic[x][y]));
            else
                System.out.print(toString(magic[x][y]) + " + ");
            ++x;
        }
        System.out.println(" = " + toString(sumRtoL));
    }

}

