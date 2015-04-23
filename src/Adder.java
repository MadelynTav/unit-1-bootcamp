/**
 * Created by c4q-madelyntavarez on 4/19/15.
 * Using a for each loop, calculate the sum of numbers that the user input.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Adder
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> adding = new ArrayList<Integer>();
        int sum=0;
        System.out.println("Give me some numbers to add");
        int num=scanner.nextInt();
        while (num!=-2){
            adding.add(num);
            System.out.println("Give me some numbers to add");
            num=scanner.nextInt();

            }
        for (Integer numbers: adding){
            sum+=numbers;
        }

        System.out.println(sum);




    }
}