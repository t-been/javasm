package oop3;

import java.util.List;

public class Driver {
    private String nickname;
    private List<Car> cars;

    public Driver(String nickname, List<Car> cars) {
        this.nickname = nickname;
        this.cars = cars;
    }

    private boolean isValidCarIndex(int carIndex) {
        if (carIndex < 0 || carIndex >= cars.size()) {
            System.out.println("❌ 유효하지 않은 차량 선택입니다.");
            return false;
        }
        return true;
    }

    public void drive(int carIndex) {
        if (!isValidCarIndex(carIndex)) return;
        Car car = cars.get(carIndex);
        System.out.println("🚗 " + nickname + "님이 " + car + " 차량을 운전 중입니다.");
        car.start();
        car.accelerate();
    }

    public void useBooster(int carIndex) {
        if (!isValidCarIndex(carIndex)) return;
        cars.get(carIndex).useBooster();
    }

    public void brake(int carIndex) {
        if (!isValidCarIndex(carIndex)) return;
        cars.get(carIndex).brake();
    }

    public void showCars() {
        System.out.println("🚗 " + nickname + "님의 차량 목록:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i));
        }
    }
}
