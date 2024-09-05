package ctest;

public class Lv1_4_0905 {
    public static void main(String[] args) {
        String input1 = "one4seveneight";
        String input2 = "23four5six7";
        String input3 = "2three45sixseven";
        String input4 = "123";

        System.out.println("입력: " + input1 + " -> 결과: " + solution(input1));
        System.out.println("입력: " + input2 + " -> 결과: " + solution(input2));
        System.out.println("입력: " + input3 + " -> 결과: " + solution(input3));
        System.out.println("입력: " + input4 + " -> 결과: " + solution(input4));
    }

    public static int solution(String s) {
        int answer = 0;

        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
