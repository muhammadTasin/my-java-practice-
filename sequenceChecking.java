import java.util.Scanner;

//A
public static void evenChecker(int a) {
    if (a % 2 == 0) {
        System.out.println("Even !");
    } else {
        System.out.println("Odd!!");
    }

}

        //B
        public static boolean isEven(int a) {
            boolean result = true;
            result = a % 2 == 0;
            return result;
        }

        //c
        public static boolean isPos(int a) {
            boolean result = true;
            result = a > 0;
            return result;
        }

        //d
        public static void sequence(int n) {
            if (isPos(n)) {
                for (int i = 0; i <= n; i++) {
                    if (isEven(i)) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                for (int j = n; j <= -1; j++) {
                    if (!isEven(j)) {
                        System.out.print(j + " ");
                    }
                }
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            evenChecker(num);
            System.out.println(isEven(num));
            System.out.println(isPos(num));
            sequence(num);

        }



