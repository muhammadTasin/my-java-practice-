import java.util.*;
public class lab2t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of the Customers grocerry shopping : ");
        int amount = sc.nextInt();

        System.out.println("Enter Customers age : ");
        int age = sc.nextInt();
        int tax = 0;
        if (age <= 0) {
            System.out.println("Invalid input! Please enter a valid age");
        } else if (amount <= 0) {
            System.out.println("Invalid input! Please enter a valid amount ");
        } else {
            if (age < 18) {
                System.out.println("Dear customer, You don't have to pay any tax ");
            } else if (amount < 10000) {
                System.out.println("Dear customer, Your ammount is less than 10k taka so, you don't have to pay any tax ");
            } else if (amount >= 10000 && amount <= 20000) {
                tax = ((amount * 5) / 100);
                System.out.println("Your payable tax is :" + tax);
            } else if (amount > 20000) {
                tax = ((amount * 10) / 100);
                System.out.println("Your payable tax is :" + tax);
            }
        }
    }
}


