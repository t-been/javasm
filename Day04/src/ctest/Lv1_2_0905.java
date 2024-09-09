package ctest;

public class Lv1_2_0905 {
    public static void main(String[] args) {
        // 입력 배열
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        // solution 메서드 호출 및 결과 출력
        int result = solution(a, b);
        System.out.println("두 배열의 내적 결과: " + result);
    }

    // solution 메서드 정의
    public static int solution(int[] a, int[] b) {
        int answer = 0;

        // 두 배열의 내적 계산
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}
