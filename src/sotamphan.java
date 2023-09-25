import java.util.Scanner;

public class sotamphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0) {
            String s = sc.next();
            boolean c = true;
            for(int i = 0; i<s.length(); i++) {
                if(s.charAt(i) != '0' && s.charAt(i)!= '1' && s.charAt(i)!= '2') c = false;
            }
            if(c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
