import java.util.*;
public class BooleanEvenCheacker {
    public static boolean isEven (int a) {
        boolean result = false;
        if (a%2 ==0) {
            result =true;
        }
        else {
            result= false;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in) ;
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean result = isEven(num);
        System.out.println(result);

        }
    }

