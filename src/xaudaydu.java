import java.util.Scanner;

public class xaudaydu {
    static int[] ds = new int[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            for(int i = 0; i<s.length(); i++) {
                ds[s.charAt(i) - 'a']++;
            }
            int sum = 0;
            for(int i = 0; i < 26; i++) {
                if (ds[i] > 0) sum+=1;
            }
            if (26 - sum <= k) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
