import java.util.Scanner;

public class lietketohop_2 {
    static int[] a = new int[12];
    static int[] c = new int[12];
    static int dem = 0;
    public static void out(int k) {
        for(int i = 1; i<=k; i++) {
            System.out.print(a[i]);
        }
        dem+=1;
        System.out.print(" ");
    }
    public static void Try(int d,int n,int k,int pos) {
        for (int i = pos; i<=n; i++) {
            if (c[i] == 0) {
                c[i] = 1;
                a[d] = i;
                if (d == k) {
                    out(k);
                }
                else Try(d+1,n,k,i+1);
                c[i] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            a[i] = 0;
            c[i] = 0;
        }
        dem = 0;
        Try(1,n,k,1);
        System.out.println();
        System.out.printf("Tong cong co %d to hop",dem);
    }
}
