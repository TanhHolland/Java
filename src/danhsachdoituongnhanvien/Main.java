package danhsachdoituongnhanvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> arr = new ArrayList<NhanVien>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i<=t; i++)
            arr.add(new NhanVien(i,sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        arr.forEach(i -> System.out.println(i));
    }
}

