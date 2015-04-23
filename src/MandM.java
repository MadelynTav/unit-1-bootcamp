import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class MandM
{
    public static void main(String[] args)
    {
        int numofMM=100;
        while(numofMM>0){
            System.out.println("You have "+numofMM+". How many would you like to eat?");
            Scanner scanner=new Scanner(System.in);
            int eat=scanner.nextInt();
            if (eat>numofMM)
            {
                System.out.println("You cannot eat more MMs than what you have! Try again");
            }
            else
            numofMM=numofMM-eat;
            }
        if (numofMM==0){
            System.out.println("You ate them all!");
        }
        }
    }

