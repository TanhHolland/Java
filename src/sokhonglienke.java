import java.util.Scanner;

public class sokhonglienke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean check = true;
            int sum = Integer.parseInt(String.valueOf(s.charAt(0)));
            for(int i = 1; i<s.length(); i++) {
                int a = Integer.parseInt(String.valueOf(s.charAt(i)));
                int b = Integer.parseInt(String.valueOf(s.charAt(i-1)));
                sum+=a;
                if(Math.abs(a-b) != 2) check = false;
            }
            if(check && sum%10==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}