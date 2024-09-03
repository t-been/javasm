package array;

public class Array3 {
    public static void main(String[] args) {
        int a[][] = new int[5][5];

        // 1~100까지의 랜덤한 숫자를 각 인덱스에 넣고 예쁘게 출력하시오
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100) + 1;
                System.out.printf("%d\t", a[i][j]);
            }
            System.out.println();
        }
    }
}
