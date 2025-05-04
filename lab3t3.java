public class lab3t3 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
      for ( int i= 1;i<= 600;i++) {

          if (i%7==0 && i%9==0) {
              sum1 += i;
          }

      }
      sum = sum1;
        System.out.println("The addition of the divisors are : " + sum);
    }
}
