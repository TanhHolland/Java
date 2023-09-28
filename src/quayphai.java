import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class quayphai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i = 0; i<n; i++) {
                arr.add((int) sc.nextLong());
            }
            int k = 0;
            int size = arr.size();
            while (arr.get(size-1) >= arr.get(size-2)) {
                arr.add(arr.get(0));
                arr.remove(0);
                k++;
            }
            System.out.println(k);
        }
    }
}
