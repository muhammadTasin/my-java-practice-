import java.util.*;
public class lab2t5 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        if (num%2==0 && num>0) {
            System.out.println(num+ " is positive and even ");
        }
        else if (num%2!=0 && num>0) {
            System.out.println(num + " is positive and odd ");
        }
        else if (num<0) {
            System.out.println(num + " is negative");
        }
        else {
            System.out.println(num + " is zero");
        }

    }
}
