import java.util.*;
public class method2 {
    public static double circlearea (int radious){
        return Math.PI*radious*radious;
    }
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a num");
        int num = sc.nextInt();
        double area = circlearea(num);
        System.out.printf("%.4f\n", area);
    }
}
