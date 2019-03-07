// Lab12av100.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab12av100
{
    public static void main(String[] args)
    {
        MagpieLab12a maggie = new MagpieLab12a();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}


class MagpieLab12a
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0
                || statement.indexOf("family") >= 0
                || statement.indexOf("parent") >= 0)
        {
           ArrayList <String> randResponse = new ArrayList();
            randResponse.add("Tell me more about your family");                    //1
            randResponse.add("Your family seems cool!");                           //2
            randResponse.add("Your family seems lame!");                           //3
            randResponse.add("My family is cooler...");                            //4
            randResponse.add("Stop talking about your family, I don't care");      //5
            randResponse.add("Where were you born?");                              //6
            randResponse.add("Who is the youngest person in your family?");        //7
            randResponse.add("Who is the oldest person in your family?");          //8
            randResponse.add("Which family member is your favorite?");             //9
            randResponse.add("Which family member is your least favorite?");       //10
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);

        return randResponse.get(whichResponse);
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse()
    {
        String randResponse [] = new String[] {"Wow. Is that so?","Please.. Tell me more.", "You don't say..",
        "You aren't very very interesting to talk to...",
        "Andrew would have something cooler to say.", "But, like, why though?",
        "What is your favorite genre of death metal?" ,"Cool.", "Hm.....", "What? That's stupid."};
        final int NUMBER_OF_RESPONSES = 10;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        return randResponse[whichResponse];
	}
}
