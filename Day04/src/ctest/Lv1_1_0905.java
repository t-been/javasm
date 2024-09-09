package ctest;

public class Lv1_1_0905 {

    public static void main(String[] args) {
        // 테스트를 위한 입력 예시
        int price = 3;
        int money = 20;
        int count = 4;

        // solution 함수 호출 및 결과 출력
        long result = solution(price, money, count);
        System.out.println("부족한 금액: " + result);
    }

    public static long solution(int price, int money, int count) {
        long totalCost = 0;

        // 놀이기구를 타는 횟수에 따라 총 비용을 계산
        for (int i = 1; i <= count; i++) {
            totalCost += price * i;
        }

        // 필요한 총 금액과 가진 돈 비교
        long shortage = totalCost - money;

        // 부족한 금액이 없으면 0을 반환, 있으면 부족한 금액 반환
        return shortage > 0 ? shortage : 0;
    }
}
