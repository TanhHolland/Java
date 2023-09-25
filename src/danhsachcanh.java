import java.util.Scanner;

public class danhsachcanh {
    static int[][] a = new int[1001][1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
            for(int j = 0; j<n; j++)
                a[i][j] = sc.nextInt();
        for(int i = 0; i<n; i++)
            for(int j = i+1; j<n; j++)
                if (a[i][j] == 1) {
                    System.out.printf("(%d,%d)",i+1,j+1);
                    System.out.println();
                }
    }
}
