import java.util.Scanner;

public class Lab7Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int N = sc.nextInt();

        int[] marks = new int[N];
        String[] names = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
        }

        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int tempMark = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = tempMark;

                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}
