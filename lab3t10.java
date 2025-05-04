import java.util.*;
public class lab3t10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many numbers of termms do u want to take :");
        int num = sc.nextInt();
        int count = 0;
        int sum =0;
        for( int i = 1; count <num;i+=2) {
            if (i%2!=0) {
                sum +=i;
                count++;
            }
        }
        System.out.println("The Sum of odd Natural Numbers up to " + num+ "  terms is: " + sum);




    }
}
