package lietkesinhvientheonganh;
import java.util.ArrayList;
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
            String s = sc.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + s +":");
            String result = "";
            if (s.compareTo("KE TOAN") == 0) result = "DCKT";
            else if (s.compareTo("CONG NGHE THONG TIN") == 0) result = "DCCN";
            else if (s.compareTo("AN TOAN THONG TIN") == 0) result = "DCAT";
            else if (s.compareTo("VIEN THONG") == 0) result = "DCVT";
            else result = "DCDT";
//            String[] d = s.split("\\s+");
//            String result = "";
//            for(int i = 0; i<d.length; i++)
//                result += String.valueOf(d[i].charAt(0)).toUpperCase();
//            result = "DC" + result;
            for (SinhVien i : a) {
                if (i.getNam().compareTo(result) == 0 && i.getLop() != 'E') {
                    System.out.println(i);
                }
            }
        }
    }
}
