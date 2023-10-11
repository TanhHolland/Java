import java.util.Scanner;

public class dayuuthe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String[] a = sc.nextLine().split("\\s+");
            int dl = 0,dc = 0;
            for(int i = 0; i<a.length; i++) {
                int x = Integer.parseInt(a[i]);
                if (x % 2 == 0) dc++;
                else dl++;
            }
            if (dl > dc && (a.length % 2) != 0 || dc > dl && (a.length % 2) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
