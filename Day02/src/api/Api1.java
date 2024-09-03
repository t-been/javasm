package api;

import java.util.Random;
import java.util.Scanner;

public class Api1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력: ");
        int number = 0;
        try {
            number = sc.nextInt();
        } catch (Exception e) {
            System.out.println("숫자를 입력하세요.");
            return;
        }

        Random random = new Random();
        int num = random.nextInt(number) + 1; // 1~10
        System.out.println(num);
        sc.close();
    }
}
