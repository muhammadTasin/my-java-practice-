import java.util.*;
public class lab3t14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Reversed digits: ");
        boolean first = true;

        while (num != 0) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(num % 10);
            num /= 10;
            first = false;
        }

        System.out.println();



    }
}
