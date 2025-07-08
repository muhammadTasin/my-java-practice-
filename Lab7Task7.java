import java.util.Scanner;

public class Lab7Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23, 100, 23, 56, 100};
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] unique = new int[arr.length];
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int found = 0;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        System.out.println();
        System.out.println("New array:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}
