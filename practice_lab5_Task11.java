import java.util.*;
public class practice_lab5_Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = sc.nextInt();
        for (int row =1; row <= n; row ++) {
            for (int space =1;space <= n-row;space++){
                System.out.print(" ");
            }
            for ( int col =1; col <= 2*row-1;col++){
                if  (col == 2*row-1 || col ==1 ) {
                    System.out.print(col);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int row =n-1; row >= 1; row --) {
            for (int space =1;space <= n-row;space++){
                System.out.print(" ");
            }
            for ( int col =1; col <= 2*row-1;col++){
                if  (col == 2*row-1 || col ==1 ) {
                    System.out.print(col);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
