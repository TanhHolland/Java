import java.util.Scanner;

public class hinhvuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int kqMaxX1 = Math.max(a,c);
        int kqMAxX2 = Math.max(a1,c1);
        int kqMinX1 = Math.min(a,c);
        int kqMinX2 = Math.min(a1,c1);
        int kqX = Math.max(kqMaxX1,kqMAxX2) - Math.min(kqMinX1,kqMinX2);
        int kqMaxY1 = Math.max(b,d);
        int kqMAxY2 = Math.max(b1,d1);
        int kqMinY1 = Math.min(b,d);
        int kqMinY2 = Math.min(b1,d1);
        int kqY = Math.max(kqMaxY1,kqMAxY2) - Math.min(kqMinY1,kqMinY2);
        int kqLast = Math.max(kqX,kqY);
        System.out.println(kqLast*kqLast);
    }
}
