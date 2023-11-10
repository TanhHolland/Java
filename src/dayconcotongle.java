import java.util.*;

public class dayconcotongle {
    static List<String> list = new ArrayList<String>();
    static void Try(int a[],int pos, int n,int sum,String s) {
        if (sum % 2 == 1) {
            list.add(s);
        }
        for (int i = pos; i >=0; i--) {
            Try(a,i-1,n,sum + a[i],s + String.valueOf(a[i]) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int siz = n;
            for(int i = 0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Try(a,n-1,n,0,"");
            Collections.sort(list);
            list.forEach(i -> System.out.println(i) );
        }
    }

}
