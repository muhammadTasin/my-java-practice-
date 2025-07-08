import java.util.*;
public class lab7Arrayprac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many data you want's to take : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for ( int i =0; i<array.length;i++){
            System.out.println("Enter your data : "+i );
            int data = sc.nextInt();
            array[i] = data;
        }
        System.out.println("The element's of the array's are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }
}
