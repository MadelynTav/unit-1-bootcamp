import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class Emoticons
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How are you feeling? :) or :(");
        String emoticon=scanner.next();
        if(emoticon.equalsIgnoreCase(":)"))
        {
            System.out.println("You are happy!");
        }
        else if(emoticon.equalsIgnoreCase(":("))
        {
            System.out.println("You are sad!" + emoticon);
        }
        else
        {
            System.out.println("I am unsure of how you are feeling today :/");
        }
    }
}
