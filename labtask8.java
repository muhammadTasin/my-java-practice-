import java.util.Scanner;

public class labtask8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();


        String result = "";

        boolean makeUppercase = false;

        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);

            if ((current >= 'a' && current <= 'z') || (current >= 'A' && current <= 'Z')) {

                if (current >= 'A' && current <= 'Z') {
                    current = (char)(current + 32);
                }


                if (makeUppercase) {
                    current = (char)(current - 32);
                }

                makeUppercase = !makeUppercase;
            }

            result = result + current;
        }

        System.out.println(result);

        sc.close();
    }
}