/** Come Back And Finish This
 * Created by c4q-madelyntavarez on 4/17/15.
 */
public class TripleLetters
{
    public static String tripleLetters(String input){
        String newWord="";
        for (int i=0;i<input.length()-1;i++){
            if (input.charAt(i)==input.charAt(i+1)){
                newWord+=input.charAt(i);
            }
            else
                newWord+=input.charAt(i);
        }
        return newWord;
    }

    public static void main(String[] args)
    {
        System.out.println(tripleLetters("Hello"));
    }
}
