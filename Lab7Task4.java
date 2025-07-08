import java.util.Scanner;

public class Lab7Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (input number): ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number (input number): ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0) {
                arr[i] = 1;
            } else if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.println("After modifying:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
