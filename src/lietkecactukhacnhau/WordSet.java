package lietkecactukhacnhau;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
     private String kq;
     private TreeSet<String> set = new TreeSet<>();
     public WordSet(String vanBan) throws IOException {
         kq = "";
         Scanner sc = new Scanner(new File(vanBan));
         while (sc.hasNext()) {
             set.add(sc.next().toLowerCase());
         }
         for(String i : set) {
             kq += i + "\n";
         }
     }
    @Override
    public String toString() {
        return kq;
    }
}
