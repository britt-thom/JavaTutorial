package Tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.next();
        String h = "hello";
        h.length();

        System.out.println(str("hi"));
        System.out.println(add2(6));
        tim("Timmmmmm", 4);
    }

    public static void tim(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }
}