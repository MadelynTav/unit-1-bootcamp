/**
 * Created by c4q-madelyntavarez on 4/17/15.
 *  Write a method that swaps the first and second halves of a string. For example,
 *  swapHalves("Hello, world!") returns "world!Hello, ".
 *  The resulting string should be exactly the same length as the original.
 *  FINISH!!!Write a method that prints the complementary triangle.
 *
 */
public class SwapHalves
{
    public static String swapingHalves(String input)
    {
        String firstHalf = "";
        String secondHalf = "";
        for(int i = 0; i <= input.length() / 2; i++)
        {
            secondHalf += input.charAt(i);
        }
        for(int i = input.length() / 2; i <= input.length() - 1; i++)
        {
            firstHalf += input.charAt(i);
        }
        firstHalf = firstHalf + secondHalf;
        return firstHalf;
    }

    public static void triangleOne(String input)
    {
        String adding = "";
        for(int i = 0; i < input.length(); i++)
        {
            adding += input.substring(i, i + 1);
            System.out.println(adding);
        }
    }
//FINISH!!!Write a method that prints the complementary triangle.
    public static void triangleTwo(String input)
    {
        String adding = "";
        for(int i = 0; i < input.length(); i++)
        {
            adding += input.substring(i);

        }

    }
//Write a method that shortens a string to a given number of characters
// by removing the end and replacing it with three dots. For example,
// elide("Hello, world!", 10) returns "Hello, ...". Make sure the resulting
// string is exactly the specified length. If the string is too short, return
// it unmodified.
    public static String elide(String input, int length, char end)
    {

        String elideWord = "";
        //char replacer = '.';
        if(input.length() >= length)
        {
            for(int i = 0; i < length; i++)
            {
                if(i < length - 3)
                {
                    elideWord += input.charAt(i);
                }
                else elideWord += end;
            }
        }
        else
        elideWord=input;
        return elideWord;
    }

    public static void main(String[] args)
    {
        System.out.println(elide("Hello World", 10,'*'));
        System.out.println(swapingHalves("Hello, World!"));
        triangleOne("Hello");
       // triangleTwo("Hello");
    }
}
