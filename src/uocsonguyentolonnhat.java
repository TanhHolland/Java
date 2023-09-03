import java.util.Scanner;

public class uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong();
            int kq = -1;
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i ==0) {
                    kq = Math.max(kq,i);
                    while (n%i == 0) n/=i;
                }
            }
            System.out.println(Math.max(kq,n));
        }
    }
}
