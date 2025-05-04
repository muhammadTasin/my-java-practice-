import java.util.*;
public class lab2t3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num%5==0 && num%7==0 ) {
            System.out.println("The number is both divisible by 5 & 7");
        }
        else if (num%5==0 && num%7!=0) {
            System.out.println("The number is divisible by 5 ");

        }
        else if (num%5!=0 && num%7==0) {
            System.out.println("The number is divisible by 7 ");
        }
        else {
            System.out.println(num + " is neither divisible by 5 or 7");
        }

    }
}
