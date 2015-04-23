import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by MadelynTav on 4/14/15.
 *
 */
public class DataStructures
{
    public static void mostFrequentElement(ArrayList input)
    {

    }
    //    public static boolean canRentACar(HashMap)
    //    {
    //
    //    }


    public static void main(String args[])
    {

        ArrayList<Cat> myCats = new ArrayList<Cat>();
        Cat garfield = new Cat("garfield");
        Cat jenny = new Cat("Jenny");
        Cat john = new Cat("John");
        Cat jake = new Cat("Jake");
        Cat sam = new Cat("Sam");
        myCats.add(garfield);
        myCats.add(jake);
        myCats.add(jenny);
        myCats.add(john);
        myCats.add(sam);

        // for(int i=0;i<myCats.size();i++){
        //    System.out.println(myCats.get(i).getName());
        //}

        HashMap<String, Integer> myPod = new HashMap<String, Integer>();
        Person p1 = new Person();
        p1.setName("Pooja");
        p1.setAge(25);
        Person p2 = new Person();
        p2.setName("Dison");
        p2.setAge(24);
        Person p3 = new Person();
        p3.setName("Janneisy");
        p3.setAge(26);
        myPod.put(p1.getName(), p1.getAge());
        myPod.put(p2.getName(), p2.getAge());
        myPod.put(p3.getName(), p3.getAge());

        ArrayList<String> myWords=new ArrayList<String>();
        myWords.add("a");
        myWords.add("aa");
        myWords.add("bb");

        System.out.println(wordsWithoutList(myWords,2));


        //        for(int i = 0; i < myPod.size(); i++)
        //        {
        //            System.out.println;
        //        }
        //
    }
}






