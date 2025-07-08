import java.util.Scanner;

public class Lab7Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (input number): ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number (input number): ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < N - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
        System.out.println();
        System.out.println("Sorted Array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
