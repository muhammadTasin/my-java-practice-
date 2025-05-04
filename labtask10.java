import java.util.Scanner;

public class labtask10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your password : ");
        String password = sc.nextLine();
        sc.close();

        boolean found = false;

        for (int i = 0; i <= password.length() - name.length(); i++) {
            boolean match = true;
            for (int j = 0; j < name.length(); j++) {
                if (password.charAt(i + j) != name.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}
