import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {
    public static int calculateSquare(int num){
        return num*num;
    }
    public static double calculateSquareRoot(int num){
        return  Math.sqrt(num);
    }
    public static String toLower(String input){
        return input.toLowerCase();
    }
    public static boolean isMultiple(int num, int num2){
        if (num2%num==0){
            return true;
        }
        else
            return false;
    }
    public static void prettyInteger(int num){
        char star='*';
        String sides="";
        for(int i=0;i<num;i++){
            sides+=star;
        }
        System.out.println(sides+num+sides);

    }
    public static int randomInt(int num1, int num2){
        Random random=new Random();
        int randomInt= random.nextInt((num2-num1)+1)+num1;
        return randomInt;
    }

  public static void main (String args[]) {
      System.out.println(calculateSquare(2));
      System.out.println(calculateSquareRoot(9));
      System.out.println(toLower("Tomorrow will be a cold day"));
      System.out.println(isMultiple(2,5));
      prettyInteger(5);
      System.out.println(randomInt(2,10));


  }
}
