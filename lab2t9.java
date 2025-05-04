import java.util.*;
public class lab2t9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the 1st side length of your triangels : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 1st side length of your triangels : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the 1st side length of your triangels : ");
        int num3 = sc.nextInt();

        if (num1 >0 && num2>0 && num3 > 0) {
            if (num1 == num2 && num2 == num3) {
                System.out.println("This is a Equilateral triangle");
            }
            else if ((num1== num2 || num1==num3  || num2 == num3)) {
                System.out.println("This is a Isosceles triangle");
            }
            else
                System.out.println("This is a Scalene triangle");
            }
        else {
                System.out.println(" Invalid input ! Please input positive integers . ");
            }

          }

    }

