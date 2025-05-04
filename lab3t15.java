import java.util.*;
public class lab3t15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        if (num < 0) {
            System.out.print("Forward digits: -");
            temp = -temp;
        } else {
            System.out.print("Forward digits: ");
        }

        int divisor = 1;
        int tempForDivisor = temp;
        while (tempForDivisor >= 10) {
            tempForDivisor /= 10;
            divisor *= 10;
        }

        if (temp == 0) {
            System.out.println("0");
            return;
        }

        boolean first = true;
        while (divisor > 0) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(temp / divisor);
            temp %= divisor;
            divisor /= 10;
            first = false;
        }

        System.out.println();


    }
}
