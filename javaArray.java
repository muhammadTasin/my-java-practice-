import java.util.Scanner;
public class javaArray {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Student's attempted sub");
//        int sub = sc.nextInt();
        double sum =0;
        int $39 = 6;
        double [] Tasfiq = new double [10];
        Tasfiq [0] = 22;
        Tasfiq [1] = 98.9;
        Tasfiq [2] = 99.3;
        Tasfiq [3] = 67.8;
        Tasfiq [4] = 75;
        Tasfiq [5] =87;
        Tasfiq [6] = 99;
        Tasfiq [7] = 100;
        Tasfiq [8] = 89;
        Tasfiq [9] = 82;

        for (int i =0; i< Tasfiq.length; i++) {
            sum += Tasfiq[i];
        }

        System.out.println(sum);

    }
}
