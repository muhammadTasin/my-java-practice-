import java.util.*;
public class StringRemoveCharUpercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String newword = "";

        for (int i = 0; i < word.length(); i++) {
            if ((i + 1 )% 2 != 0) {
                newword += word.charAt(i);
            }
        }
            for (int j = 0; j<newword.length(); j++){
                char ch = newword.charAt(j);
                if (ch >='a' && ch <='z') {
                    ch = (char) (ch - 32);


                }
                System.out.print(ch);
                }
                 System.out.println();
               sc.close();

            }

        }


