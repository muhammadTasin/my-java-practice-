import java.util.*;
public class lab6t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String word = sc.nextLine();
        String temp ="";


        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-' || word.charAt(i)==',') {
                System.out.print("\n");
                continue;
            }
            System.out.print(word.charAt(i));

    }
  }
}

