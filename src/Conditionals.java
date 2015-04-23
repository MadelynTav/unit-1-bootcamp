/**
 * Created by Madelyn Tavarez on 4/14/15.
 *
 *
 *
 */
import java.util.Scanner;
public class Conditionals
{
    public static boolean isOdd(int x)
    {
        if(x % 2 != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean isMultipleOfThree(int x)
    {
        if(x % 3 == 0)
        {
            return true;

        }
        else return false;

    }

    public static boolean isOddAndMultipleOfThree(int x)
    {
        if(x % 2 != 0 && x % 3 == 0)
        {
            return true;
        }
        else return false;

    }

    public static boolean isoddAndMultipleOfThree2(int x)
    {
        if(isOdd(x) && isMultipleOfThree(x))
        {
            return true;
        }
        else return false;
    }
    public static boolean isFromLondon(Person person){
        if(person.getCity().equalsIgnoreCase("London")){
            return true;
        }
        else
            return false;
    }
    public static void printName(Person person)
    {
        person.getName();
        if(person.getName().length() == 5)
        {
            System.out.println(person.getName());
        }
            else

                System.out.println("Name is too short");


        }


    public static void  FizzMultipleOfThree(int x)
    {
        if(isMultipleOfThree(x))
        {
            System.out.println("Fizz");
        }
        else
        {
            System.out.println(x);
        }
    }

    //When squirrels get together for a party, they like to have cigars.
    // A squirrel party is successful when the number of cigars is between
    // 40 and 60, inclusive. Unless it is the weekend, in which case there
    // is no upper bound on the number of cigars. Write a method called
    // cigarParty that takes an int (the number of cigars) and boolean
    // (whether or not it is the weekend) as parameters, and returns true if
    // the party with the given values is successful, or false otherwise.
    public static boolean cigarParty(int cigars, boolean isWeekend){
        if (isWeekend==false && cigars>=40&&cigars<=60){
            return true;
        }
        else if (isWeekend==true&&cigars>=40){
            return true;
        }
        else
            return false;

    }

    //You are driving a little too fast, and a police officer stops you.
    // Write code to compute the result, encoded as an int value: 0=no ticket,
    // 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
    // If speed is between 61 and 80 inclusive, the result is 1. If speed is
    // 81 or more, the result is 2. Unless it is your birthday -- on that day,
    // your speed can be 5 higher in all cases.

    public static int ticketSize(int speed, boolean isBDay)
    {
        int size=0;
        if(isBDay == true)
        {
            if(speed <= 65)
            {
                size = 0;
            }
            else if(speed >= 66 && speed <= 85)
            {
                size = 1;
            }

        }
        if(isBDay == false)
        {
            if(speed <= 60)
            {
                size = 0;
            }
            else if(speed >= 61 && speed <= 80)
            {
                size = 1;
            }

            else size = 2;
        }
    return size;
    }
  public static void main (String args[]) {
//      Scanner scanner=new Scanner(System.in);
//      System.out.println("Please give me a number");
//      int x=scanner.nextInt();
//      System.out.println(isOdd(x));
//      System.out.println(isMultipleOfThree(x));
//      System.out.println(isOddAndMultipleOfThree(x));
//      System.out.println(isoddAndMultipleOfThree2(x));
//      FizzMultipleOfThree(x);
//      Person person=new Person();
//      person.setName("Mary");
//      printName(person);
//      System.out.println(cigarParty(55,false));
//      System.out.println(ticketSize(66, true));
  }
}
