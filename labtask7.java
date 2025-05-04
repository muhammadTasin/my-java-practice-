import java.util.Scanner;

public class labtask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese input a word : ");
        String str1 = sc.nextLine();
        System.out.println("plese input another word : ");
        String str2 = sc.nextLine();
        String result = "";

        for (int i = 0; i < str1.length(); i++) {
            char current = str1.charAt(i);
            boolean isCommon = false;

            for (int j = 0; j < str2.length(); j++) {
                if (current == str2.charAt(j)) {
                    isCommon = true;
                    break;
                }
            }

            if (!isCommon) {
                result = result + current;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char current = str2.charAt(i);
            boolean isCommon = false;

            for (int j = 0; j < str1.length(); j++) {
                if (current == str1.charAt(j)) {
                    isCommon = true;
                    break;
                }
            }

            if (!isCommon) {
                result = result + current;
            }
        }
        String uppercase = "";
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            uppercase = uppercase + ch;
        }

        System.out.println(uppercase);
        sc.close();
    }
}