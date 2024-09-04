package codingtest;

import java.util.Scanner;

public class Test1 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1 ) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Test1 sol = new Test1();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(sol.solution(input));
    }
}
