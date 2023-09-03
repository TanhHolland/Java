import java.util.Scanner;
public class kiemtrasoFibonanci {
    public static String check(long n) {
        if (n <= 2) return "YES";
        long a = 1,b = 1,c = 2;
        while (c < n) {
            a = b;
            b = c;
            c = a + b;
        }
        if(c == n) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(check(n));
        }
    }
}
