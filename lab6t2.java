import java.util.*;
public class lab6t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();

        String revword = "";

        for ( int i =word.length()-1; i>0;i--){
            revword += word.charAt(i);


        }
    }
}
