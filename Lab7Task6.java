import java.util.Scanner;

public class Lab7Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array (input number): ");
        int N = sc.nextInt();
        double[] arr = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number (input number): ");
            arr[i] = sc.nextDouble();
        }
        double max = arr[0];
        int maxIndex = 0;
        double min = arr[0];
        int minIndex = 0;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
            sum = sum + arr[i];
        }
        double avg = sum / N;
        System.out.println("Maximum element " + max + " found at index " + maxIndex);
        System.out.println("Minimum element " + min + " found at index " + minIndex);
        System.out.println("Summation: " + sum);
        System.out.println("Average: " + avg);
    }
}
