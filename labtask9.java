import java.util.Scanner;

public class labtask9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        sc.close();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (ch >= 'A' && ch <= 'Z') {
                    hasUpper = true;
                } else if (ch >= 'a' && ch <= 'z') {
                    hasLower = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasDigit = true;
                } else if (ch != ' ') {
                    hasSpecial = true;
                }
            }
        }

        if (hasUpper && hasLower && hasDigit && hasSpecial && password.length() >= 8) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

