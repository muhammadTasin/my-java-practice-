import java.util.*;
public class lab2t2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Score ");
        int score = sc.nextInt();
        if (score<=100 && score>= 90) {
            System.out.println("Your grade is A");
        }
        else if (score<=89 && score>= 85) {
            System.out.println("Your grade is A-");
        }
        else if (score<=84 && score>= 70) {
            System.out.println("Your grade is B");
        }
        else if (score<=69 && score>= 57) {
            System.out.println("Your grade is C");
        }
        else if (score<=50 && score>= 56) {
            System.out.println("Your grade is D");
        }
        else if (score<=50 && score>= 0) {
                System.out.println("Your grade is F");
            }
            else {
                System.out.println("Invalid input, please enter number betwwen 0 to 100");
            }
        }
    }

