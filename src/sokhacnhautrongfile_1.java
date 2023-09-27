import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.util.Arrays.*;

public class sokhacnhautrongfile_1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap <Integer,Integer> map = new TreeMap<>();
        ArrayList <Integer> arr = new ArrayList<>();
        while (sc.hasNext()) {
            int s = Integer.parseInt(sc.next());
            if (!map.containsKey(s)) {
                map.put(s,1);
                arr.add(s);
            }
            else {
                map.put(s,map.get(s) + 1);
            }
        }
        Collections.sort(arr);
        arr.forEach(i -> System.out.println(i + " " + map.get(i)));
    }
}
