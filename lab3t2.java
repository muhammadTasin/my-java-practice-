import java.util.*;
public class lab3t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer : ");
        int num = sc.nextInt();
        int sum = 0;
        double avg = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                sum += i;

            }
            avg = sum / num;
            System.out.println("The sum of " + num + " is : " + sum);
            System.out.println("The average of" + num + " is : " + avg);
        }
            else {
                System.out.println("Input posetive integer ");
            }
        }
    }



