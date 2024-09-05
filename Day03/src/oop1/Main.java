package oop1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

        car.go();
        car.beeak();

        Car car2 = new Car(100, "My Car", "Red");
        System.out.println(car2);
        car2.go();
        car2.beeak();
    }
}
