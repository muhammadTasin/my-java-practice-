import java.util.*;
public class lab2t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gratest = Integer.MIN_VALUE;
        System.out.println(" input how many numbers do u want to check : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter integer no : " + i);
            int input = sc.nextInt();
            if (input > gratest) {
                gratest = input;
            }
        }

        System.out.println("The largest number is : " + gratest);

    }
}

