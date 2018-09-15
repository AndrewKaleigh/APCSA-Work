// Lab03v80.java
// Student 80-point version of the Lab03 assignment.


public class Lab03v80
{
    public static void main(String[] args)
    {
        int InitSec = 10000;
        int Hours = InitSec / 3600;
        int Minutes = (InitSec % 3600) / 60;
        int Seconds = (InitSec % 3600) % 60;
        
      System.out.println("Lab03, 80 Point Version\n");
      System.out.println("Starting Seconds:"+ InitSec);
      System.out.println("Hours:" + Hours);
      System.out.println("Minutes:" + Minutes);
      System.out.println("Seconds:" + Seconds);
    }
}

