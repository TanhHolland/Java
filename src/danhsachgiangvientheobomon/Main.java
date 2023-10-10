package danhsachgiangvientheobomon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<GiangVien> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=t; i++) {
            a.add(new GiangVien(i,sc.nextLine(),sc.nextLine()));
        }
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i<=k; i++) {
            String[] s = sc.nextLine().split("\\s+");
            String result = "";
            for(int j = 0; j<s.length; j++)
                result += String.valueOf(s[j].charAt(0)).toUpperCase();
            System.out.println("DANH SACH GIANG VIEN BO MON " + result +":");
            for (GiangVien x : a)  {
                if (x.getLop().compareTo(result) == 0) System.out.println(x);
            }
        }
    }
}
