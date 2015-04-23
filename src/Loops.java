import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;


import static java.lang.Integer.*;

/**
 *
 *
 > 1. Write a method that prints the numbers 1 through 10 using a loop.
 > 2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
 > 3. Write a method that takes in an `int` n and prints the numbers 1 through n.
 > 4. Write a method that takes in an `int` n and prints the even numbers 2 through n.
 > 5. Write a method that prints the sum of 1 through 10 using a loop.
 > 6. Write a method that takes in an `int` n and prints the sum of the numbers 1 through n using a loop.
 > 7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
 > 8. Write a method that takes in an `int` n and a `String` s and prints out s on its own line, n times. If n is negative, print "".
 > 9. Modify the method to print out the string concatenated with itself n times.
 >10. Write a method that prints the first ten Fibonnaci numbers.
 >11. Modify the method to sum the first ten Fibonnaci numbers.
 >12. Modify the method to take in an `int` n and sum the first n Fibonnaci numbers.
 *
 */
public class Loops
{
    public static void OneThroughTen()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }

    }

    public static void OneThroughTen2()
    {
        int i = 0;
        while(i < 10)
        {
            i++;
            System.out.println(i);
        }
    }

    public static void takesNum(int x)
    {
        for(int i = 0; i <= x; i++)
        {
            System.out.println(i);
        }
    }

    public static void takesNumTwo(int x)
    {
        for(int i = 0; i < x; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static int SumOfOneToTen()
    {
        int sum = 0;
        for(int i = 0; i <= 10; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static int SumOfOneThroughN(int n)
    {
        int sum = 0;
        for(int i = 0; i <= n; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void StringIntTimes(String s, int n)
    {
        for(int i = n; i > 0; i--)
        {
            System.out.print(s);
            if(i < 0)
            {
                System.out.println("");
            }
        }
    }

    public static int FiboNums1(int x)
    {
        if(x == 0)
        {
            return 0;
        }
        if((x == 1) || (x == 2))
        {
            return 1;
        }

        int fiboNum = (FiboNums1(x - 1) + FiboNums1(x - 2));
        int sumFibo = fiboNum + fiboNum;
        return sumFibo;
    }

    //Given a string, return the sum of the numbers appearing in the string,
    // ignoring all other characters. A number is a series of 1 or more digit
    // chars in a row. (Note: Character.isDigit(char) tests if a char is one
    // of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string
    // to an int.)

    public static int sumNumbers(String input)
    {
        int sum = 0;

        for(int i = 0; i < input.length() - 1; i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {

                sum += Integer.parseInt(String.valueOf(input.charAt(i)));

            }
            else continue;
        }
        return sum;
    }
    //Given a string, return a string where every appearance of the lowercase word
    // "is" has been replaced with "is not". The word "is" should not be immediately
    // preceeded or followed by a letter -- so for example the "is" in "this" does
    // not count. (Note: Character.isLetter(char) tests if a char is a letter.)

    public static String isNot(String input)
    {
        String modifiedString = "";

        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == 's' && input.charAt(i - 1) == 'i')
            {
                modifiedString += "";
            }
            if(input.charAt(i) == 'i' && input.charAt(i + 1) == 's')
            {
                if((! Character.isLetter(i - 1) && ! (Character.isLetter(i + 2)) || ! (Character
                        .isDigit(i + 2))))
                {
                    String isNot = "is not";
                    modifiedString += isNot;
                }

            }
            else if(input.charAt(i) == 's')
            {
                modifiedString += "";
            }

            else modifiedString += input.charAt(i);
        }
        return modifiedString;
    }

    //Given a string and a non-empty word string, return a string
    // made of each char just before and just after every appearance
    // of the word in the string. Ignore cases where there is no char
    // before or after the word, and a char may be included twice if it
    // is between two words.
    public static String betweenWords(String input, String lookFor)
    {
        String modified = "";
        for(int i = 0; i < input.length() - 2; i++)
        {
            if(input.charAt(i) == lookFor.charAt(0) && input.charAt(i + 1) == lookFor.charAt(1))
            {
                modified += input.charAt(i - 1);
                modified += input.charAt(i + 2);
            }
        }
        return modified;
    }

    //Use nested for loops to generate a list of all the pairs of
    // positive two digit numbers whose sum is 60, and whose difference is 14.

    public static void numberPuzzle()
    {
     HashMap<Integer,Integer> numbers= new HashMap<Integer, Integer>();
        for(int i = 10; i < 100; i++)
        {
            for(int g = 10; i < 100; g++)
            {
                if(i + g == 60 || g + i == 60)
                {
                    numbers.put(i,g);

                    if(i - g == 14||g-1==14) {
                        System.out.println(numbers);
                        i++;
                        g++;

                    }
                }

            }
        }

    }

    public static void Digits(){
        String newString="";
        for(int i=1;i<10;i++){
            for (int g=0;g<10;g++){
                System.out.println(String.valueOf(i)+String.valueOf(g)+", "+String.valueOf(i)+'+'+String.valueOf(g)+'='+(i+g));
            }
        }
    }
//    Use nested for loops to generate a list of all the positive two digit
//    numbers. Display the numbers, and the sums of their digits.
  public static void main (String args[]) {
//      OneThroughTen();
//      OneThroughTen2();
//      takesNum(4);
//      takesNumTwo(10);
//      System.out.println(SumOfOneToTen());
//      System.out.println(SumOfOneThroughN(1000));
//     StringIntTimes("Madelyn", 7);
//      for(int i = 0; i <=10; i++)
//      {
//
//          System.out.println(FiboNums1((i)));
//      }
//      System.out.println(FiboNums1((10)));
//     System.out.println(sumNumbers("I want12 t4o go45 can3dies"));
//      System.out.println(isNot("is-is"));
//      System.out.println(betweenWords("Tolsrrow 15ls23 wlsg", "ls"));
//      numberPuzzle();
//      Digits();
  }
}
