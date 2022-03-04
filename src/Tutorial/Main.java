package Tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Dog tim = new Dog("tim",4 );
        tim.speak();

        Dog bill = new Dog("bill",7 );
        bill.speak();

        int x = tim.setAge(10);
        System.out.println(x);
    }
}