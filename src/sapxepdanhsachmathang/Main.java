package sapxepdanhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MatHang> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i<=t; i++) {
            a.add(new MatHang(i,sc.nextLine(),sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(a);
        a.forEach(i -> System.out.println(i));
    }
}
