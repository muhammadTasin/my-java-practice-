import java.util.*;
public class lab2t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of X : ");
        int x = sc.nextInt();
        int calc = 0;

        if (x<0) {
            calc = 2*x;
            System.out.println(calc);
        }
        else if (x>=0 && x< 2) {
            calc = x+1;
            System.out.println(calc);
        }
        else if (2<=x && x < 5) {
            calc = (int) Math.pow(x,2)-1;
            System.out.println(calc);
        }
        else if (x>=5) {
            calc = ((3*x*x)+2);
            System.out.println(calc);
        }
    }
}
