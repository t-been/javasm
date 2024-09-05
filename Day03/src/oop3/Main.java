package oop3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 엔진 생성
        Engine engine1 = new Engine("V8 터보", 500);
        Engine engine2 = new Engine("V6", 400);
        Engine engine3 = new Engine("전기 모터", 300);

        // 차량 생성
        Car car1 = new Car("스피드카", "빨강", engine1);
        Car car2 = new Car("드리프트카", "파랑", engine2);
        Car car3 = new Car("전기차", "초록", engine3);

        // 차량 리스트에 추가
        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        // 운전자 생성
        Driver driver = new Driver("RacerX", cars);

        // 운전자가 소유한 차량 목록을 보여줌
        driver.showCars();

        // 사용자가 차량을 선택하여 운전
        Scanner scanner = new Scanner(System.in);
        System.out.println("🚗 운전할 차량 번호를 선택하세요: ");
        int carIndex = scanner.nextInt() - 1;

        boolean exit = false;

        while (!exit) {
            System.out.println("\n*** 선택할 작업을 고르세요 ***");
            System.out.println("1. 차량 운전");
            System.out.println("2. 부스터 사용");
            System.out.println("3. 브레이크");
            System.out.println("4. 연료 추가");
            System.out.println("5. 차량 멈추기");
            System.out.println("6. 종료");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    driver.drive(carIndex);
                    break;
                case 2:
                    driver.useBooster(carIndex);
                    break;
                case 3:
                    driver.brake(carIndex);
                    break;
                case 4:
                    System.out.println("⛽ 추가할 연료의 양을 입력하세요: ");
                    int fuelAmount = scanner.nextInt();
                    cars.get(carIndex).refuel(fuelAmount);
                    break;
                case 5:
                    cars.get(carIndex).stop();
                    break;
                case 6:
                    exit = true;
                    System.out.println("게임을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
