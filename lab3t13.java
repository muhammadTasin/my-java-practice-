import java.util.*;
public class lab3t13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        if (num == 0) {
            count = 1;
        }

        System.out.println("Total digits = " + count);

    }
}