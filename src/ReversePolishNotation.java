import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class ReversePolishNotation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int one = scanner.nextInt();
        System.out.println("Please enter another number");
        int two = scanner.nextInt();
        System.out.println("Enter an operator");
        String operator = scanner.next();


        int answer;

        if(operator.equalsIgnoreCase("+"))
        {
            answer = one + two;
            System.out.println(answer);
        }
        if (operator.equalsIgnoreCase("-")){
            answer=one-two;
            System.out.println(answer);
        }
        if (operator.equalsIgnoreCase("*")){
            answer=one*two;
            System.out.println(answer);
        }
        if (operator.equalsIgnoreCase("/")){
            answer=one/two;
            System.out.println(answer);
        }
        if(operator.equalsIgnoreCase("%"))
        {
            answer = one % two;
            System.out.println(answer);
        }
        else
        {
            System.out.println("Not a valid operator!");
        }


    }
}
