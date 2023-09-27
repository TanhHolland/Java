package sapxepthoigian;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List <Time> arr = new ArrayList <Time> ();
        while (t-->0) {
            Time dt = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            arr.add(dt);
        }
        Collections.sort(arr);
        arr.forEach(i -> System.out.println(i));
    }
}
