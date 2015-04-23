/**
 * Created by c4q-madelyntavarez on 4/17/15.
 */
public class reverseString
{
    public static String reverseString(String sentence){
        String reverse = "";
        for (int i=sentence.length()-1;i>=0;i--)
        {
            reverse+=sentence.length();
        }
        return reverse;
    }
    public static void main(String[] args)
    {
        System.out.println(reverseString("Tomorrow"));
    }
}
