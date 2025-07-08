import java.util.Scanner;

public class Lab7Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the length of array 1 (input number): ");
        int len1 = sc.nextInt();
        int[] arr1 = new int[len1];
        System.out.println("Please enter the elements of the arr1:");
        for (int i = 0; i < len1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Please enter the length of array 2 (input number): ");
        int len2 = sc.nextInt();
        int[] arr2 = new int[len2];
        System.out.println("Please enter the elements of the arr2:");
        for (int i = 0; i < len2; i++) {
            arr2[i] = sc.nextInt();
        }

        int isSubset = 1;
        for (int i = 0; i < len2; i++) {
            int found = 0;
            for (int j = 0; j < len1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                isSubset = 0;
                break;
            }
        }

        if (isSubset == 1) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    }
}
