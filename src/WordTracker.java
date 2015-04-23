import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/19/15.
 */
public class WordTracker
{

    public static void main(String[] args)
    {
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        String input="";
        boolean addMode=true;

        if (input.equalsIgnoreCase("rm")){
            addMode=false;
        }
        else if (input.equalsIgnoreCase("add"))
        {
            addMode = true;
        }

        while(true)
        {
            System.out.println("Please give me some words to add");
            input = scanner.nextLine();
            words.put(input, 1);

            if(input.equalsIgnoreCase("stop"))
            {
                words.remove(input);
                break;
            }

            if (!addMode)
            {
                    words.remove(input);

                }



            else  if (addMode)
             {

                     words.put(input, 1);
                     continue;
                 }


             }

            System.out.println("Thanks, you added " + words.size()+" words");
        }

    }
