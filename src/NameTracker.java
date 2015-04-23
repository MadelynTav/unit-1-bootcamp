/**
 * Created by c4q-madelyntavarez on 4/19/15.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class NameTracker
{
    public static void main(String[] args)
    {
        ArrayList<String> names= new ArrayList<String>();


        names.add("Madelyn");
        while (true)
        {
            System.out.println("Please give me some names to add");
            Scanner scanner=new Scanner(System.in);
            String input = scanner.next();
            while(scanner.hasNext())
            {
                names.add(input);
            }

            System.out.println("You have added "+ names.size()+" names!");
            System.out.println(names.get(0));
        }

    }
}
