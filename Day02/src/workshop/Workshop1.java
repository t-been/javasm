/*1. int 형 1차원 배열 5개에 중복 되지 않게
1~10까지의 난수를 입력 한다.
단 중복 되지 않게 입력 한다.
2.  입력된 배열에서 최대 값과 최소 값을 출력 하시오*/

package workshop;

public class Workshop1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        int max = 0;
        int min = 11;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10) + 1;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.printf("최대 값 : %d, 최소 값 : %d", max, min);
    }
}
