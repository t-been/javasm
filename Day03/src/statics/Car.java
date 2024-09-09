package statics;

public class Car {
    private int serial;
    private String name;
    private String color;
    public static String vender = "KK";
    public static int count = 0;

    public Car() {
    }

    public Car(String name, String color) {
        this.serial = ++count;
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}


