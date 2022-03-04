package Tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    String[] names = new String[5];
    Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n:names) {
            System.out.println(n);
        }
    }
}