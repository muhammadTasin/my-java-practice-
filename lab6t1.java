import java.util.*;
public class lab6t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word/sentence : ");
        String word = sc.nextLine();

        for (int i =0;i<word.length();i++){
            char temp =word.charAt(i);
            if (temp >='a' && temp <='z') {
                System.out.print((char) (temp - 32));
            }
            else {
                System.out.print(temp);
            }
        }
        sc.close();
    }
}
