import java.util.Scanner;

public class Lab7Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (input number): ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number (input number): ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search (input number): ");
        int search = sc.nextInt();
        int found = -1;
        for (int i = 0; i < N; i++) {
            if (arr[i] == search) {
                found = i;
                break;
            }
        }
        if (found != -1) {
            System.out.println(search + " is at index " + found);
        } else {
            System.out.println("Element not found");
        }
    }
}
