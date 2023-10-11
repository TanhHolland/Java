import java.util.Scanner;

public class solama {
    static int getVa(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine();
            int sum = getVa(s.charAt(s.length()-1));
            for(int i = s.length()-2; i>=0; i--) {
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                if (getVa(a) < getVa(b)) sum-= getVa(a);
                else sum+=getVa(a);
            }
            System.out.println(sum);
        }
    }
}
