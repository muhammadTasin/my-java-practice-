import java.util.*;
public class FibonacciMethod {
    public static int Fibonacci(int a) {
        int ans = 1;
        if (a>0) {
         for ( int i =1; i<=a;i++) {
             ans *=i;
             }
         }
        else if (a==0) {
            ans =1;
        }
        else {
            System.out.println(ans+" is negative number. Please Enter a posetive integer");
        }
        return ans;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int result = Fibonacci(num);
        System.out.println(result);
    }

}
