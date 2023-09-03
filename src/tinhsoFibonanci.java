import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class tinhsoFibonanci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            long [] f = new long [n+1];
            f[1] = 1;
            f[2] = 1;
            for(int i = 3 ; i<=n; i++) f[i] = f[i-2] + f[i-1];
            System.out.println(f[n]);
        }
    }
}
