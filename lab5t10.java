import java.util.*;
public class lab5t10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n- row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == n || col == 1 || col == 2*row-1) {
                    System.out.print(col);
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}