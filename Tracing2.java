
/*public class Tracing2 {      //join call e click kor
    public static void main(String[] args) {
        boolean var1, var2, var3, var4, var5, var6;
        boolean result1, result2, result3, result4, result5;
        boolean result6, result7, result8, result9, result10;
        var1 = var2 = var3 = var4 = var5 = var6 = false;
        result1 = result2 = result3 = result4 = result5 = false;
        result6 = result7 = result8 = result9 = result10 = false;
        var1 = (!false || false) && true;
        var2 = var1 && true;
        var3 = false && !true;
        var4 = true;
        var5 = false;
        var6 = var3 && true;
        result1 = (var1 && var2) && (40 % 3 > 45) || (var5 && var6);
        result2 = (var1 || var2) || (result1 && false);                 //true
        result3 = (var1 && result1) || result2 || var5;                  // t
        result4 = (var1 || var2) || ((var3 && var1) && false);          // t
        result5 = (var1 && var2) && (result3 || var1);                  //t
        result6 = ((var3 || !var2) && result5) || true;
        result7 = (var4 && result1) && ((result1 && false) || true);
        result8 = ((var1 && result3) && (!var5 || var6)) && true;       // t
        result9 = ((result2 && var2) || (!result7 && var1)) && !false;  // t
        result10 = !(var1 && true);
        System.out.println(result1 + " " + result2);
        System.out.println(result3 + " " + result4);
        System.out.println(result5 + " " + result6);
        System.out.println(result7 + " " + result8);
        System.out.println(result9 + " " + result10);
    }
}

-----------------------------------------------------------------
v1   |   v2 |  v3   |   v4   |   v5   |   v6   |
f       f       f        f        f        f
t       t       f        t        f        f

----------------------------------------------------------------
r1   |   r2 |  r3 |  r4 |  r5 |  r6 |  r7 |  r8 |   r9 |   r10 |
f        f     f     f     f     f     f     f      f       f
f        t     t     t     t     t     f     t      t       f

---------------------------------------------------------------
   out
   f t
   t t
   t t
   f t
   t f
   */
public class Tracing2 {
    public static void main(String[] args) {
        int i = 123;
        int lnum = i%100;
        lnum = lnum%10;
        int fst = i/100;
        int mid = i/10;
        mid = mid%10;
        int sum =0;
        sum = lnum+fst+mid;
        System.out.println(sum);

    }
}
