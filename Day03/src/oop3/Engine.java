package oop3;

public class Engine {
    private String name;
    private int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void start() {
        System.out.println("🔧 " + name + " 엔진이 작동합니다. 출력: " + power);
    }

    public void stop() {
        System.out.println("🔧 " + name + " 엔진이 꺼졌습니다.");
    }
}
