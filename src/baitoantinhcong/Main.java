package baitoantinhcong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien p = new NhanVien(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine());
        System.out.println(p);
    }
}
