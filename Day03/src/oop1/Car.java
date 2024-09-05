package oop1;

public class Car {
    private int serial;
    private String name;
    private String color;


    public Car() {
        serial = 0;
    }
    public Car( String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    public Car(int serial, String name, String color) {
        this.serial = serial;
        this.name = name;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "serial=" + serial +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void go() {
        System.out.println(this.name); //this는 car라는 레퍼런스의 이름, 아무것도 들어 있지않으면 자동으로 Null 생성
        System.out.println("Car go");
    }
    public void beeak() {
        System.out.println(this.name);
        System.out.println("Car break");
    }
}
