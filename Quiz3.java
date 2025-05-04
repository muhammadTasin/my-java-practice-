import java.util.*;
public class Quiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word :");
        String word = sc.nextLine();
        System.out.println("Enter an integer : ");
        int k = sc.nextInt();
        String newword ="";
        String revword = "";

        if (k <= word.length()) {
            for ( int i =0; i<word.length();i++) {
                if ((i + 1) % k != 0) {
                    newword += word.charAt(i);
                }
            }
               for ( int j = newword.length()-1;j>=0;j--) {
                   revword += newword.charAt(j);
               }
                   String result ="";
                   for ( int i =0;i<revword.length();i++) {
                           char c = revword.charAt(i);
                           if (c >= 'a' && c <= 'z') {
                               result += (char) (c - 32);

                           } else {
                               result += c;
                           }
                       }
                      System.out.println(result);
                   }

        else {
            System.out.println("Sorry variable k is bigger than word's length");
        }

    }

}







