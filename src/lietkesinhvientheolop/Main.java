package lietkesinhvientheolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<SinhVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        int k = Integer.parseInt(sc.nextLine());
        while (k-->0) {
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + s +":");
            for (SinhVien i : a) {
                if (i.getLop().compareTo(s) == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
