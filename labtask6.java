import java.util.Scanner;

public class labtask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Speak yer magic phrase, matey:");
        String input = sc.nextLine();
        sc.close();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if it's a letter (A-Z or a-z)
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                // Check if it's a vowel manually
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        if (vowelCount > 0 && consonantCount > 0 &&
                vowelCount % 3 == 0 && consonantCount % 5 == 0) {
            System.out.println("Aaarr! Me Plunder!!");
        } else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}
