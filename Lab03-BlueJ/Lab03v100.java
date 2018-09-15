// Lab03v100.java
// Student 100-point version of the Lab03 assignment.


public class Lab03v100
{
    public static void main(String[] args)
    {
      System.out.println("Lab03, 100 Point Version\n");
        int initMilli = 10000123;
        int hours = initMilli / 3600000;
        int minutes = (initMilli % 3600000) / 60000;
        int minutesRemainingInHour = (initMilli % 360000);
        int seconds = (minutesRemainingInHour % 60000);
        int secondsTwo = (seconds / 1000);
        int milliseconds = (seconds % 1000);
        
      System.out.println("Lab03, 100 Point Version\n");
      System.out.println("Starting Miliseconds:"+ initMilli);
      System.out.println("Hours:" + hours);
      System.out.println("Minutes:" + minutes);
      System.out.println("Seconds:" + secondsTwo);
      System.out.println("Miliseconds:" + milliseconds);
    }
}

