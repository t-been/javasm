package oop2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("k1", "red", 50, 10);

        try {
            car1.addFuel(80);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        System.out.println(car1);
        car1.go(275);
        car1.brake();
    }
}
