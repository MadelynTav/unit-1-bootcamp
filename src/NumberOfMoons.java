import java.util.HashMap;

/**
 * Created by c4q-madelyntavarez on 4/19/15.
 */
public class NumberOfMoons
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> numOfMoons = new HashMap<String, Integer>();
        numOfMoons.put("Mercury", 0);
        numOfMoons.put("Venus", 1);
        numOfMoons.put("Mars", 2);
        numOfMoons.put("Earth", 1);
        int num=numOfMoons.get("Mercury");
        System.out.println(num);
        System.out.println(numOfMoons.get("Mars"));
    }
}
