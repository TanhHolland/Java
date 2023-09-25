import java.util.Scanner;

public class xaukhacnhaudainhat {
    static int check(String s1,String s2) {
        if (s1.equals(s2)) return -1;
        return Math.max(s1.length(),s2.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(check(s1,s2));
        }
    }
}
