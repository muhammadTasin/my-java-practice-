import java.util.*;
public class reviewlab10practice1 {
    public static void  modifyStrings(String a, String b, String c) {
        String newb = "";
        String result = "";

        int length = a.length();
        if ( b.length()<a.length()){
            length=b.length();
        }

        for ( int i =0; i<length;i++){
            if ( b.charAt(i)!= b.charAt(i)) {  // b te ana dilam ar temp ew ana ache so
                newb+=newb.charAt(i);
            }


        }
        result+=newb+c;
        System.out.println(result);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main String : ");
        String a = sc.nextLine();
        System.out.println("Enter which one to chnge : ");
        String b = sc.nextLine();
        System.out.println("Enter which one to add : ");
        String c = sc.nextLine();
        System.out.println("After modifiying the result is : ");
        modifyStrings(a,b,c);
    }


    }

