import java.util.*;
public class lab3t8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sum =0;

            while (true) {
                System.out.println("Enter a number : ");
                int num = sc.nextInt();
                sum = num*num;

                if (num<0) {
                    System.out.println("Negative number detected ! Please input a posetive integer");
                    break;
            }
                System.out.println("Answer is : "+ sum);
        }



        }
    }

