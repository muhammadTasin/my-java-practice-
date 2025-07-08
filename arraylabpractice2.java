import java.util.*;
public class arraylabpractice2 {
    public static void main(String[] args) {
        int array [] = {9, -5, 7, 9, -5, 5, 7};
        System.out.println("Before duplacating the array is : "+ " \n "+ Arrays.toString(array));
        for ( int i =0; i<array.length;i++){
            for ( int j =0; j<i;j++){
                if (array[i]== array[j]) {
                    array[i]   =0;
                    break;
                }
            }
            }
        System.out.println("After replacing duplacating with 0 : ");
        for ( int i =0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        }
    }

