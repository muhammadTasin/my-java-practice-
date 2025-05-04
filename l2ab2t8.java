import java.util.*;
public class l2ab2t8 {
    public static void main (String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();


        float max_num = Float.MIN_VALUE;
        float min_num = Float.MAX_VALUE;
        if (num1 > max_num) {
            max_num = num1;
        }
        if (num2 > max_num) {
            max_num = num2;
        }
        if (num3 > max_num) {
            max_num = num3;
        }
        if (num1 < min_num) {
            min_num = num1;
        }
        if (num2 < min_num) {
            min_num = num2;
        }
        if (num3 < min_num) {
            min_num = num3;
        }
        System.out.println("The maximum number is: " + max_num);
        System.out.println("The minimum number is: " + min_num);

    }
}
