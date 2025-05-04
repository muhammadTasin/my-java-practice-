import java.util.*;
public class lab3t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valus of y : ");
        int num = sc.nextInt();
        int sum = 0;

        for ( int i =1; i<= num; i++) {
            if (i%2 ==0) {
                sum-= i*i;

            }
            else {

                sum+=i*i;
            }
        }
        System.out.println("The sum of y is : "+sum);


    }
}