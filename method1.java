import java.util.*;
public class method1 {
    public static String evenChecker(int a) {
        String ans = "";
        if (a % 2 == 0) {
            ans = ("Even !!");
        } else {
            ans += ("Odd !!");

        }
        return ans;
    }


        public static void main (String[]args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter a number :");
            int num = sc.nextInt();
            String result = evenChecker(num);
            System.out.println("result :" + result);
        }
    }


