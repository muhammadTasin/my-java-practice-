import java.util.*;
public class lab3t9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int posetivecount = 0;
        int negativecount = 0;

       while (true) {
           System.out.println("Enter 0 to stop the code or enter an integer : ");
           int num = sc.nextInt();

           if (num>0) {
               posetivecount++;
           }
           else if (num<0) {
               negativecount++;
           }
           else {
               break;
           }


           }
        System.out.println("Number of positive numbers: " + posetivecount);
        System.out.println("Number of negative numbers: " + negativecount);

    }
    }

