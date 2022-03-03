package Tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();

      if (s.equals("tie")) {
          System.out.println("You typed tie");
      }
      else if (s.equals("hello")) {
          System.out.println("hi");
      }
      else {
          System.out.println("Print");
      }
    }
}
