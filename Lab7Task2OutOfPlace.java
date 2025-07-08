import java.util.Scanner;

public class Lab7Task2OutOfPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array (input number): ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number (input number): ");
            arr[i] = sc.nextInt();
        }
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = arr[n - 1 - i];
        }
        System.out.println("Reversed using a new array:");
        for (int i = 0; i < n; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();
    }
}
