/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class Counting
{
    public static void main(String[] args)
    {
        int count=100;
        while(count >1)
        {
            if (count>10){
                System.out.println(count);
            count=count-5;
            System.out.println(count);
        }
            else
            {
                count = count - 1;
                System.out.println(count);
            }
        }
    }
}
