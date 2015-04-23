/**
 * Created by c4q-madelyntavarez on 4/17/15.
 */
public class replaceChars
{
    public static String change(String input)
    {
        String newS = "";
        for (int i=0; i<=input.length()-2;i++)
        {
          if (i%2==0){
              newS+=input.charAt(i+1);
          }
           else
            newS += input.charAt(i - 1);
        }
        return newS;
    }


    public static void main(String[] args)
    {
        System.out.println(change("Madelyn"));
    }
}
