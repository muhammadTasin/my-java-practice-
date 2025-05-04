import java.util.Scanner;

public class labtask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();
        sc.close();

        String result = "";
        int end = input.length() - 1;

        while (end >= 0) {

            while (end >= 0 && input.charAt(end) == ' ') {
                end--;
            }
            if (end < 0) break;
            int start = end;
            while (start >= 0 && input.charAt(start) != ' ') {
                start--;
            }
            String word = "";
            for (int i = start + 1; i <= end; i++) {
                word += input.charAt(i);
            }

            if (!result.equals("")) {
                result += " ";
            }
            result += word;
            end = start - 1;
        }

        System.out.println(result);
    }
}

