import java.util.*;
public class recursssionpractice {
    public static void onton (int start, int end) {
        if ( start>end){
            return;
        }
        else {
            System.out.print(start+ " ");
            onton(start+1,end);
        }
    }
    public static void onton2 ( int start, int end) {
        if ( start >end) {
            return;
        }
        else {
            System.out.print(end + " ");
            onton2 (start,end-1);
        }
    }
    public static int onton3 ( int start, int end) {
        if (start > end) {
            return 0;
        }
       return start+ onton3(start+1, end);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statrting a number ");
        int num = sc.nextInt();
        System.out.println("Enter a ending number : ");
        int num2 = sc.nextInt();
        System.out.print("After assending we get : ");
        onton(num,num2);
        System.out.println();
        System.out.print("After desending we get : ");
        onton2(num,num2);
        System.out.println();
        System.out.print("After summing your result :");
        System.out.println(onton3(num,num2));
    }
}
