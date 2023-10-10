package sapxeptheomasinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<SinhVien> a = new ArrayList<>();
        while (sc.hasNextLine()){
            a.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(a);
        a.forEach(i-> System.out.println(i));
    }
}
