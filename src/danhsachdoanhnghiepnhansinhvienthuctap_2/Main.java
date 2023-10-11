package danhsachdoanhnghiepnhansinhvienthuctap_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> a = new ArrayList<>();
        while (t-->0)
            a.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        int test = Integer.parseInt(sc.nextLine());
        while (test-->0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(String.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:",i,j));
            for (DoanhNghiep x : a) {
                if (i <= x.soluong && x.soluong <=j) System.out.println(x);
            }
        }
    }

}