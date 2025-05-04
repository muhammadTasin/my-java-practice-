import java.util.*;

public class lab2t10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to pay : ");
        int toPay = scanner.nextInt();

        System.out.print("Enter the amount given : ");
        int given = scanner.nextInt();
        int diff = given - toPay;

        if (diff > 0) {
            System.out.println("Return amount: " + diff + " taka");

            System.out.println("100 taka note: " + (diff / 100));
            diff %= 100;
            System.out.println("50 taka note: " + (diff % 100) / 50);
            diff %= 50;

            System.out.println("20 taka note: " + (diff % 50) / 20);
            diff %= 20;
            System.out.println("10 taka note: " + (diff % 20) / 10);
            diff %= 10;
            System.out.println("5 taka coin: " + (diff % 10) / 5);
            diff %= 5;
            System.out.println("2 taka coin: " + (diff % 5) / 2);
            diff %= 2;
            System.out.println("1 taka coin: " + (diff % 2));
        } else if (diff < 0) {
            System.out.println("Please pay " + (-diff) + " taka more.");
        } else {
            System.out.println("No change needed.");
        }

    }
}

