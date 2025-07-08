import java.util.*;
public class arraypractice2 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many data do u want to take : ");
        int size = sc.nextInt();
        int [] array = new int[size];

        for ( int i =0; i<array.length;i++) {
            System.out.println("Enter your data : ");
            int data = sc.nextInt();
            array[i] = data;
        }
        for ( int j =0; j<array.length;j++) {

            System.out.println((j+1) + " " + array[j]);
        }
// in here i am creating a new array as well as changing the value of the new array
        System.out.println("Enter your new data : ");
        int newdata = sc.nextInt();
        int [] newarray = new int[array.length+1];

        for ( int i =0;i<array.length;i++) {
            newarray[i] = array[i];


        }


            if (array.length >= 3) {
                System.out.println("Enter the new value : ");
                int repval = sc.nextInt();
                newarray[2] = repval;

//            } else {
//                System.out.println(Arrays.toString(array));
           }
        newarray[newarray.length-1] = newdata;


        System.out.println(Arrays.toString(newarray));

        sc.close();
        }
    }

