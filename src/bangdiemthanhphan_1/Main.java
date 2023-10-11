package bangdiemthanhphan_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<SinhVien> a = new ArrayList<>();
        for (int i = 1; i<=t; i++){
            a.add(new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a);
        int dem = 1;
        for (SinhVien x : a) {
            System.out.print(dem +" ");
            System.out.println(x);
            dem+=1;
        }
    }
}
