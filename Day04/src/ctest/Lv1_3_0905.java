package ctest;

public class Lv1_3_0905 {
    public static void main(String[] args) {
        // 입력 예시
        String input1 = "abcde";  // 홀수 길이
        String input2 = "qwer";   // 짝수 길이

        // solution 함수 호출 및 결과 출력
        System.out.println("입력: " + input1 + " -> 가운데 문자: " + solution(input1));
        System.out.println("입력: " + input2 + " -> 가운데 문자: " + solution(input2));
    }

    // solution 함수 정의
    public static String solution(String s) {
        int length = s.length();

        // 문자열 길이가 짝수인 경우
        if (length % 2 == 0) {
            return s.substring(length / 2 - 1, length / 2 + 1);
        }
        // 문자열 길이가 홀수인 경우
        else {
            return s.substring(length / 2, length / 2 + 1);
        }
    }
}
