import java.util.*;
public class lab2t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a year : ");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year % 400 == 0) {
            System.out.println(year + "is a leapyear");

        }
        else {
            System.out.println(year + " is not a leapyear" );
        }


    }
}
