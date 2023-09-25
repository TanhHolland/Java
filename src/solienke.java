import java.util.Scanner;

public class solienke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean check = true;
            for(int i = 1; i<s.length(); i++) {
                int a = s.charAt(i);
                int b = s.charAt(i-1);
                if(Math.abs(a-b) != 1) check = false;
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
