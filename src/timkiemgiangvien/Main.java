package timkiemgiangvien;
import java.util.ArrayList;
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
            String s = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s +":");
            s = s.toLowerCase();
            for (GiangVien x : a)  {
                boolean check = false;
                String name = x.getName().toLowerCase();
                if (name.indexOf(s) != -1) {
                    check = true;
                }
                if (check) System.out.println(x);
            }
        }
    }
}