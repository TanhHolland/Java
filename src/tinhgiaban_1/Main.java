package tinhgiaban_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SanPham> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++) {
            a.add(new SanPham(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        a.forEach(i-> System.out.println(i));
    }

}
