package ctest;

public class Lv1_2_0904 {

    public static int solution(int[] number) {
        int answer = 0;

        // 3중 for문을 이용하여 모든 가능한 세 학생의 조합을 탐색
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    // 세 학생의 정수 번호의 합이 0이 되는 경우
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++; // 삼총사 조합의 수 증가
                    }
                }
            }
        }

        return answer; // 삼총사 조합의 수 반환
    }

    public static void main(String[] args) {
        // 테스트 데이터
        int[] number1 = {-2, 3, 0, 2, -5};
        int[] number2 = {-3, -2, -1, 0, 1, 2, 3};
        int[] number3 = {-1, 1, -1, 1};

        // 결과 출력
        System.out.println("Test Case 1: " + solution(number1)); // Expected Output: 2
        System.out.println("Test Case 2: " + solution(number2)); // Expected Output: 5
        System.out.println("Test Case 3: " + solution(number3)); // Expected Output: 0
    }
}
