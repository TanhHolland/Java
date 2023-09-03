import java.util.Scanner;

public class tinhluythua {
    public static final int mod = 1000000007;
    public static long luyThua(long n,long k) {
        if(k == 0) return 1;
        else {
            long temp = luyThua(n,k/2);
            if(k%2 == 0) return temp%mod*temp%mod;
            else return temp%mod*temp%mod*n%mod;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n == 0 && k == 0) break;
            System.out.println(luyThua(n,k));
        }
    }
}
