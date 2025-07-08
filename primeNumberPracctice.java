import java.util.*;
public class primeNumberPracctice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }
        else if (num == 2) {
            isPrime = true;
        }
        else if (num % 2 == 0) {
            isPrime = false;
        }
        else {
            // Check divisibility from 3 up to num/2 (instead of sqrt(num))
            for (int i = 3; i <= num / 2; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}