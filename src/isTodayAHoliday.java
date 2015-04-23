import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class isTodayAHoliday
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What month is it?");
        String month=scanner.next();
        System.out.println("Please enter the day of the month");
        int day=scanner.nextInt();

        if(month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month
                .equalsIgnoreCase("November") || month.equalsIgnoreCase("December"))
        {
            System.out.println("Daylight Savings is not in effect.");
        }
        else if(month.equalsIgnoreCase("March") && day < 8)
        {
            System.out.println("Daylight Savings is not in effect.");
        }
        else if(month.equalsIgnoreCase("March") && (day >= 8))
        {
            System.out.println("Daylight Savings is in effect");
        }
        else
        {
            System.out.println("Daylight Savings is in Effect");
        }



    }
}
