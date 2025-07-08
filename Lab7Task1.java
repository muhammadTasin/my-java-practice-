
import java.util.Scanner;

public class Lab7Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (input number): ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number (input number): ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter another number (input number): ");
        int newElement = sc.nextInt();
        System.out.println("The elements of the array are:");
        for (int i = 0; i < N; i++) {
            System.out.println(i + ": " + arr[i]);
        }
        int[] newArr = new int[N + 1];
        for (int i = 0; i < N; i++) {
            newArr[i] = arr[i];
        }
        newArr[N] = newElement;
        System.out.println("After resizing the array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
