import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        BigInteger res = num1.subtract(num2);
        System.out.println(res);
    }
}
