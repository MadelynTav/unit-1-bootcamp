import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/16/15.
 */
public class aLittleQuiz
{
    public static void main(String[] args)
    {
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the capital of New York?");
        System.out.println("A) Alaska\nB)Albany \nC)Atlanta");
        String firstAnswer = scanner.next();
        if(firstAnswer.equalsIgnoreCase("b"))
        {
            System.out.println("Thats Correct!");
            score++;
        }
        else
        {
            System.out.println("Sorry " + firstAnswer + " is not the correct answer!");
        }
        System.out.println("Am I 23? Yes or No?");
        String answer=scanner.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Correct I am 23!");
            score++;
        }
        else {
            System.out.println("I actually am!");
        }
        System.out.println("Your score is: "+ score);
    }
}
