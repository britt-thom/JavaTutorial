package Tutorial;

public interface Vehicle {

    final int gears = 5;
    void speedUp(int a);
    void slowDown(int a);
    void changeGear(int a);

    default void out() {
        System.out.println("Default method");
    }
}
