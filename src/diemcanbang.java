import java.util.Scanner;

public class diemcanbang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            for(int i = 1; i<n; i++) {
                a[i] = a[i-1] + a[i];
            }
            for(int i = n-2; i>=0 ; i--) {
                b[i] = b[i+1] + b[i];
            }
            int pos = -2;
            for(int i = 0; i<n; i++) {
                if(a[i] == b[i]) {
                    pos = i;
                    break;
                }
            }
            System.out.println(pos+1);
        }
    }
}
