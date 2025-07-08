import java.util.*;
public class methodpractice1 {
    public static void evencheker(int a) {
        if (a % 2 == 0) {
            System.out.println("Even !!");
        } else {
            System.out.println("Odd ");
        }
    }

    public static boolean iseven(int a) {
        boolean result = true;
        if (a % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean ispos(int a) {
        boolean result = false;
        if (a > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }

    public static void sequence(int n) {

        if (ispos(n)) {

                for (int i = 0; i <= n; i++) {
                    if (iseven(i)){
                        System.out.print(i+" ");
                    }
                }
            System.out.println();

               } else {
            for (int i = n; i <= -1; i++) {
                if (!iseven(i)) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        iseven(num);
        ispos(num);
        sequence(num);


    }
}
