import java.util.Scanner;

public class chiatamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            double n = sc.nextInt();
            double h = sc.nextInt();
            double dt = h/2;
            for(float i = 1; i<n; i++) {
                double sqrt = Math.sqrt(i / n );
                double v = h * sqrt;
                System.out.printf("%.6f ",v);
            }
            System.out.println();
        }
    }
}
