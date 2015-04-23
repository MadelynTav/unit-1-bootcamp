/**
 * Created by c4q-madelyntavarez on 4/18/15.
 * Write a method zapTo(string, zapChar) that returns the portion of
 * the string up to but not including the first occurence of zapChar.
 * For example, zapChar("Hello, world!", ',') returns "Hello".
 */
public class DivingStrings
{
    public static String zapCar(String input, char upTo){
        String inputTwo="";
        for (int i=0;i<input.length();i++){

            if(input.charAt(i)==upTo){
                break;
            }
            else
                inputTwo+=input.charAt(i);
        }return inputTwo;
    }
//Write a method replace1(string, fromChar, toChar) that replaces the
// first incidence of a character with another. For example,
// replace1("Hello, world!", 'w', 'V') returns "Hello, Vorld!".
    public static String replaceIt(String input, char old, char replaced){
        String inputTwo="";
        for(int i=0;i<input.length();i++){
            if (input.charAt(i)==old){
                inputTwo+=replaced;
            }
            else
                inputTwo+=input.charAt(i);
        }
        return inputTwo;
    }
//Extend your replace() methods to replace one string with another string.
// Note that there are corresponding indexOf() methods for strings.
//    public static String replaceString(String input, String one, String Two){
//        String replaced="";
//        for (int i=0;i<input.length();i++){
//            if (input.indexOf()=='a'){
//                replaced+=
//            }
//        }
//    }

    //Write a method that produces title capitalization,
    // i.e. the first letter of each word is capitalized. For example,
    public static String titleCapitalize(String input){

        String capitalized= String.valueOf(input.toUpperCase().charAt(0));
        for (int i=1; i<input.length();i++)
        {
            if(input.charAt(i - 1)==' ')
            {
                capitalized += input.toUpperCase().charAt(i);
            }
            else
                capitalized+=input.toLowerCase().charAt(i);
        }
        return capitalized;
   }
    //Write a method that converts a phrase to
    // a Java variable name by performing the following:
//    dropping punctuation characters
//    capitalizing words, except the first
//    removing spaces
    public static String covertToJava(String input){
        String javaString= String.valueOf(input.toLowerCase().charAt(0));
        for (int i=1;i<input.length();i++){
            if (input.charAt(i)=='!'||input.charAt(i)=='?'||input.charAt(i)=='.')
            {
                continue;
            }
            if (input.charAt(i)==' '){
                continue;

            }
            if (input.charAt(i-1)==' '){
                javaString+=input.toUpperCase().charAt(i);
            }
            else
                javaString+=input.charAt(i);
        }
        return javaString;
    }
    //Write a method that replaces every character of each word except
    // for the first two and the last with - characters.

    public static void main(String[] args)
    {
        System.out.println(zapCar("Tomorrow",'r'));
        System.out.println(replaceIt("How Do You Do?!", 'o','*'));
        System.out.println(titleCapitalize("hello my name is how are you?"));
        System.out.println(covertToJava("hello my name is how are you?"));
    }
}
