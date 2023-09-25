import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            BigInteger num1 = new BigInteger(a);
            BigInteger num2 = new BigInteger(b);
            String max = num1.max(num2).toString();
            String res = num1.subtract(num2).abs().toString();
            while (res.length() < max.length()) {
                res = "0" + res;
            }
            System.out.println(res);
        }
    }
}
