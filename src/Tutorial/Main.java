package Tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    ArrayList<Integer> t = new ArrayList<>();
    t.add(1);
    t.add(2);
    t.add(1);
    t.add(2);
    t.add(1);
    t.add(2);
    t.get(0);
    t.set(1, 5);
    t.subList(1,3);

    System.out.println(t.subList(1,3));
    }
}