import java.util.*;
public class BoleeanPositivenumChecker {
    public static boolean isPos(int a) {
        boolean result = true;
        if ( a>=0){
            result=true;
        }
        else {
            result= false;
        }
        return result;
    }
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int num = sc.nextInt();
        boolean result = isPos(num);
        System.out.println(result);
    }

}
