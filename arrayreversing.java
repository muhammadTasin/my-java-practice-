import java.util.*;
public class arrayreversing {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many data do u want to take : ");
        int size = sc.nextInt();
        int [] array = new int [size];
        for ( int i =0; i<array.length;i++) {
            System.out.println("Enter your data : ");
            int data = sc.nextInt();
            array [i] = data;

        }
        System.out.println("After reversing the array : ");
        for ( int j = array.length-1;j>=0;j--){
            System.out.println(array[j]);
        }

        int [] array2  =  {2, 3, 4, 5, 6};
        int [] temp = array2;

        System.out.println("After reversing the new array we get : ");
        for ( int i = temp.length-1; i>=0;i--) {
            System.out.println(array2[i]);
        }
        sc.close();
    }
}




