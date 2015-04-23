/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class FizzBuzz
{
    public static void main(String[] args)
    {
        int start=100;
        while(start>0){
            start=start-1;
            if(start % 3 == 0 && start % 5 == 0)
            {
                System.out.println("Fizz Buzz");
            }
            else if (start %3==0){
                System.out.println("Fizz");
            }
            else if(start % 5 == 0)
            {
                System.out.println("Buzz");
            }

            else
            {
                System.out.println(start);
            }
        }
    }
}
