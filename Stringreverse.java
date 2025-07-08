import java.util.*;
public class Stringreverse {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String temp = "";
        String result = "";

        for ( int i =0; i<word.length()-1;i++) {
            temp +=word.charAt(i);
        }
        for ( int i = word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
        System.out.println(result);
    }
}
