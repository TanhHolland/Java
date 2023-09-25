import java.util.Scanner;

public class tichmatranvoichuyenvicuano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int test = 1; test <= t; test++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            int[][] c = new int[n][n];
            for(int i = 0; i<n; i++) {
                for(int j = 0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i<m; i++) {
                for(int j = 0; j<n; j++) {
                    b[i][j] = a[j][i];
                }
            }
            System.out.printf("Test %d:\n",test);
            for(int i = 0; i<n; i++) {
                for(int j = 0; j<n; j++) {
                    for (int k = 0; k<m; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            for(int i = 0; i<n; i++) {
                for(int j = 0; j<n; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
