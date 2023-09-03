import java.util.Scanner;

public class tonguocso1 {
    public static void main(String[] args) {
        int[] a = new int[2000009];
        a[0] = 1;
        a[1] = 1;
        for(int i = 2; i<=1000005; i++) {
            if(a[i] == 0) {
                for(int j = i*2; j<=2000000; j+=i) {
                    if(a[j] == 0) {
                        a[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i<=2000000; i++) if(a[i] == 0) a[i] = i;
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int t = sc.nextInt();
        while (t-->0) {
            int so = sc.nextInt();
            while(so > 1) {
                sum += a[so];
                so /= a[so];
            }
        }
        System.out.println(sum);
    }
}
