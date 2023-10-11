package trenhat_gianhat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Nguoi> a = new ArrayList<>();
        for (int i = 1; i<=t; i++){
            a.add(new Nguoi(sc.next(),sc.next()));
        }
        Collections.sort(a);
        System.out.println(a.get(t-1).getName());
        System.out.println(a.get(0).getName());
    }
}
