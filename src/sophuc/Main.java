package sophuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            SoPhuc A = new SoPhuc(sc.nextLong(), sc.nextLong());
            SoPhuc B = new SoPhuc(sc.nextLong(), sc.nextLong());
            SoPhuc C = A.CongHaiSoPhuc(B).NhanHaiSoPhuc(A);
            SoPhuc D = A.CongHaiSoPhuc(B).NhanHaiSoPhuc(A.CongHaiSoPhuc(B));
            System.out.println(C +", " + D);
        }
    }
}
