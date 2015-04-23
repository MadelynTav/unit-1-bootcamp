/**
 * Created by c4q-madelyntavarez on 4/17/15.
 * Write a method that prints a string and then underlines it with a specified character. For example, underline("Hello, world!", '=')
 */
public class Underline
{
    public static String underline(String word, char C)
    {
        String underline = "";
        System.out.println(word);

        for(int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i)==' '){
                underline+=' ';}
            underline += C;


        }


        return underline;


    }

    public static void main(String[] args)
    {
        System.out.println(underline("Madelyn Tavarez", '*'));
    }
}
