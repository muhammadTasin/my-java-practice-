import java.util.*;
public class arraymodifier_lab7_t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your data : ");
        int size = sc.nextInt();
        int [] array = new int[size];
        for ( int i =0; i< array.length;i++){
            System.out.println("Enter your data : ");
            int data = sc.nextInt();
            array [i] = data;
            
        }
        System.out.println("Original array: \n"+ Arrays.toString(array));
        System.out.println("After modofing :");
        for ( int i =0; i<array.length;i++){
           if (array[i] ==0) {
               array[i] =0;
           }
           else if ( array[i]>0){
               array[i] =1;
           } else if (array[i]<-1) {
               array[i] = 0;
           }
            System.out.print(array[i]+" ");
        }

    }
}
