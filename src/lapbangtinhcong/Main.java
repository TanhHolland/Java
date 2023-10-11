package lapbangtinhcong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i<=t; i++) {
            a.add(new NhanVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
//        double sum = 0;
        for(NhanVien x : a) {
//            sum += x.getTong();
            System.out.println(x);
        }
//        String kq = String.format("%.0f",sum);
//        System.out.println("Tong chi phi tien luong: " + kq);
    }
}
