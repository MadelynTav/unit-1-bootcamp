/**
 * Created by c4q-madelyntavarez on 4/17/15.
 * Must Complete
 * Write a method that takes a string and a length, and returns a string consisting of the string repeated to produce a string of the given length.

 For example, repeat('abc', 10) returns "abcabcabca".
 */
public class repeats
{
    public static String repeatThis(String word, int length){
        String lengthString = "";
        for (int i=0; i<=length;i++)
        {
            if(i ==0)
            {
                lengthString += word;
            }
            if(i >0&& i<length)
            {
                lengthString += word.charAt(i-1);
            }

        }

        return lengthString;

    }

    public static void main(String[] args)
    {
        System.out.println(repeatThis("Word",4));
    }
}
