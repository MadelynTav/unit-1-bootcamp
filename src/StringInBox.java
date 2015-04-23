/**
 * Created by c4q-madelyntavarez on 4/17/15.
 * Write a method that prints a string in a box. Use - for the top and bottom,
 * | for the sides, and + for the corners. For example,
 */
public class StringInBox
{
    public static void StringInBox(String word){
        String side="|";
        String end="*";
        String topAndBottom="-";
        String completeTopAndBottom = "";
        for (int i=0;i<word.length();i++)
        {
            completeTopAndBottom +=topAndBottom;
        }

        System.out.println((end) + (completeTopAndBottom) + (end));
        System.out.println(side+word.trim()+side);
        System.out.println(end + completeTopAndBottom + end);

    }
    public static void main(String[] args)
    {
    StringInBox("Tomorrow will be a Raidant Day!");
    }
}
