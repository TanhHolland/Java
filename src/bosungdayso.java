import java.util.Arrays;
import java.util.Scanner;

public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[205];
        int max = -1;
        for (int i = 0; i<n; i++) {
            int x = sc.nextInt();
            max = Math.max(x,max);
            c[x] = 1;
        }
        boolean check = false;
        for(int i = 1; i <=max; i++) {
            if (c[i] == 0) {
                System.out.println(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println("Excellent!");
        }
    }
}
