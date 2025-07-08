import java.util.*;
public class StringPalindrome7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String revword = "";
        boolean flag = true;

        for (int i =word.length()-1;i>=0;i--) {
            revword +=  word.charAt(i);
        }
        for ( int t=0;t<word.length();t++){
            if (revword.charAt(t)!=word.charAt(t)) {
                System.out.println(word+" is not a palindrome ");
                flag = false;
                break;
            }
            
        }
        if (flag) {
            System.out.println(word+ " is a palindrome ");
        }

    }
}
