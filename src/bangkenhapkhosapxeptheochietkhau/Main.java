package bangkenhapkhosapxeptheochietkhau;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String,Integer> map = new TreeMap<>();
        List<SanPham> a = new ArrayList<>();
        while (t-->0) {
            a.add(new SanPham(sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }
        for (SanPham i : a) {
            String tu = i.getKitu();
            if(!map.containsKey(tu)) {
                map.put(tu,1);
                i.ma = tu + "0" + 1+ " ";
            }
            else {
                map.put(tu,map.get(tu) + 1);
                i.ma = tu + "0" + map.get(tu) +" ";
            }
        }
        // Mình lấy mã lần lượt cho từng sản phẩm r ms sort. Nó liên quan đến thứ tự
        Collections.sort(a);
        a.forEach(i-> System.out.println(i));
    }
}