package codingtest;

import java.util.Scanner;

public class Test2 {
    public int solution(int n) {
        int answer = 0;
        String n_ = Integer.toString(n);
        char[] arr = n_.toCharArray();
        for (char c : arr) {
            answer +=  Integer.parseInt(String.valueOf(c));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test2 solution = new Test2();
        System.out.println(solution.solution(sc.nextInt()));
    }
}
