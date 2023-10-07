package tinhtoanphanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-->0) {
            PhanSo A = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo B = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo C = A.CongPhanSo(B);
            PhanSo D = A.NhanPhanSo(B,C);
            System.out.println(C + " " + D);
        }
    }
}
