import java.util.ArrayList;
import java.util.Scanner;

public class thugondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        while (t-->0) {
            int n = sc.nextInt();
            a.add(n);
        }
        int i = 0;
        while (i < a.size()-1) {
            if ((a.get(i) + a.get(i+1))%2==0) {
                a.remove(i);
                a.remove(i);
                i = Math.max(0,i-1);
            }
            else {
                i+=1;
            }
        }
        System.out.println(a.size());
    }
}
