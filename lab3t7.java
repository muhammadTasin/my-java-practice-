import java.util.*;
public class lab3t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input a number : ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println(i);
               }
            }
        }

}
