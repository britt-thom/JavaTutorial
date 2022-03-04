package Tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    int[] x = {-99, 5, 6, 3, 2, 1, 7, 8, 0};

    Arrays.sort(x,3,6);

    for (int i:x) {
        System.out.print(i + ",");
    }
    }
}