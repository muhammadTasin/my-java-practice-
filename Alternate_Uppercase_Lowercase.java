import java.util.*;
public class Alternate_Uppercase_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String result = "";
        String temp = "";


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ((i % 2) == 0) {
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch - 32);

                }
            }
                    else if ( ch>='A' && ch<= 'Z') {
                       ch =((char) (ch+32));
            }
            result+=ch;
                }
        System.out.println(result);
        sc.close();;
            }
        }
