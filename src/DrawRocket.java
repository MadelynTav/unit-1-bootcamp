/**
 * Created by c4q-madelyntavarez on 4/17/15.
 */
public class DrawRocket
{
    public static String topAndBottom(int size){
        String tAP = "/**\\";
        String left="/";
        String right="\\";
        String result="";
        if (size==1) {
            result=tAP;
        }
        else
            for(int i=1;i<size;i++){
                System.out.println(tAP);
                right=right+right;
                left=left+left;
                result+=left+tAP+right;
            }
        return result;
    }
//    public static String addingTAP(int size){
//        String total = null;
//        for(int i=0;i<=size;i++){
//            i++;
//            char left='/';
//            char right='\\';
//            String add=topAndBottom(i);
//            total= left+add+right;
//        }
//        return total;
//    }
    public static String line(int size){
     String line="+*=*=+";
        String result="";
        if (size==1){
         result= line;
     }
        else
         for (int i=1;i<=size;i++){
             result+=line;
         }
        return result;
}
    public static String carrotUPSmall(int size){
        return "|/\\/\\|";
    }
    public static String carrotDownSmall(int size){
        return "|\\/\\/|";
    }
    public static void main(String[] args)
    {
        System.out.println(topAndBottom(1));
        System.out.println(line(2));
        System.out.println(carrotUPSmall(2));
        System.out.println(carrotDownSmall(2));
        System.out.println(line(2));
        System.out.println(carrotDownSmall(2));
        System.out.println(carrotUPSmall(2));
        System.out.println(line(2));
        System.out.println(topAndBottom(3));

    }
}
