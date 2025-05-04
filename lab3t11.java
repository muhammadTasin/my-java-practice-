import java.util.*;
public class lab3t11 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int sum =0;
        for (int i =1; i<=10;i++) {
            System.out.println("Input your number : ");
            int num = sc.nextInt();
            sum+= num;

            System.out.println(" the sum is : " + sum);

        }

    }
}
