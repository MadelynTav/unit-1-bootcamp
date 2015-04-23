/**
 * Created by c4q-madelyntavarez on 4/17/15.
 * Write a method pad(string, length, padChar) that returns string padded on the right with padChar.
 *For example, pad("Hello.", 10, '-') returns "Hello.----"
 * Write a variation that takes a fourth argument, a boolean, that specifies whether the padding should be added to the left (if true) or the right (if false).
 * For example, pad("Hello.", 10, '-', true) returns "----
 */
public class padChar
{
    public static void padChar(String word, int length, char pad){
        String newWord="";
        for (int i=0;i<length;i++){
            if(i<word.length()){
                newWord+=word.charAt(i);
            }
            else if (i>word.length()){
                newWord+=pad;
            }
        }
        System.out.println(newWord);
    }
    public static void leftOrRightPadding(String word, int length, char pad, boolean rightOrLeft){
        String newWord="";
        if (rightOrLeft==true)
        {
            for(int i = 0; i < length; i++)
            {
                if(i < word.length())
                {
                    newWord += word.charAt(i);
                }
                else if(i > word.length())
                {
                    newWord += pad;
                }
            }
        }
            if (rightOrLeft==false){
                for ( int g=length;g>=0;g--)
                {
                    if(g > word.length())
                    {
                        newWord += pad;
                    }
                }
                newWord=newWord+word;
            }

        System.out.println(newWord);
    }


    public static void main(String[] args)
    {
        padChar("Madelyn", 20, '*');
        leftOrRightPadding("Madelyn", 20, '*', false);
        leftOrRightPadding("Madelyn", 20, '*', true);
    }

}
