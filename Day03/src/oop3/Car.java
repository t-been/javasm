package oop3;

import java.util.Random;

public class Car {
    private String name;
    private String color;
    private int speed;
    private int fuel;
    private Engine engine;
    private boolean isBoosting;
    private Random random;

    public Car(String name, String color, Engine engine) {
        this.name = name;
        this.color = color;
        this.random = new Random();
        this.fuel = 100;  // 기본 연료
        this.engine = engine;
        this.isBoosting = false;
    }

    @Override
    public String toString() {
        return name + " (" + color + ")";
    }

    // 운전 시작 시마다 속도가 랜덤하게 설정됨
    public void start() {
        if (fuel > 0) {
            speed = random.nextInt(51) + 50;  // 50 ~ 100 사이의 랜덤 속도
            engine.start();
            System.out.println("🚗 " + name + "가 출발했습니다! 현재 속도: " + speed + "km/h");
        } else {
            System.out.println("⛽ 연료가 부족합니다. 연료를 채워주세요.");
        }
    }

    // 가속 시 속도가 계속 변동
    public void accelerate() {
        if (fuel <= 0) {
            System.out.println("⛽ 연료가 부족합니다.");
            return;
        }

        int previousSpeed = speed;  // 가속 전 속도를 기록
        int accelerationSpeed;

        // 부스터 사용 시 추가 속도
        if (isBoosting) {
            int boosterSpeed = random.nextInt(21) + 20;  // 부스터 시 20 ~ 40 추가 속도
            speed += boosterSpeed;
            isBoosting = false;  // 부스터 사용 후 자동으로 종료
            System.out.println("🚀 " + name + "가 부스터를 사용 중입니다! 속도: " + speed + "km/h (이전 속도: " + previousSpeed + "km/h)");
            fuel -= 10;
        } else {
            accelerationSpeed = random.nextInt(16) + 5;  // 5 ~ 20 사이의 가속 증가
            speed += accelerationSpeed;
            System.out.println("🏎️ " + name + "가 가속 중입니다. 속도: " + speed + "km/h (이전 속도: " + previousSpeed + "km/h)");
            fuel -= 5;
        }

        if (speed <= previousSpeed) {
            speed = previousSpeed + 1;  // 속도가 항상 이전 속도보다 높아지도록 보장
        }

        if (fuel < 0) fuel = 0;
        System.out.println("⛽ 남은 연료: " + fuel);
    }

    public void brake() {
        System.out.println("🚦 " + name + "가 브레이크를 밟습니다.");
        speed = 0;  // 브레이크 시 속도를 0으로 설정
    }

    public void useBooster() {
        if (fuel <= 0) {
            System.out.println("⛽ 연료가 부족하여 부스터를 사용할 수 없습니다.");
            return;
        }
        isBoosting = true;
        System.out.println("🚀 부스터가 활성화되었습니다!");
    }

    // 부스터 종료 메서드를 삭제했으므로, 자동으로 종료됨

    public void refuel(int amount) {
        fuel += amount;
        if (fuel > 100) fuel = 100;  // 연료는 100을 넘지 않도록 설정
        System.out.println("⛽ " + amount + "만큼 연료를 추가했습니다. 현재 연료: " + fuel);
    }

    public void stop() {
        engine.stop();
        System.out.println("🚗 " + name + "가 멈췄습니다.");
        speed = 0;  // 차량이 멈출 때 속도를 0으로 설정
    }
}
