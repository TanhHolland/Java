package baitoantuyensinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new SinhVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
    }
}
