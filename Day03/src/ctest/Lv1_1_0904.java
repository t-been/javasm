package ctest;
import java.util.ArrayList;

public class Lv1_1_0904 {

    public static int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
        int[] answer = new int[tempList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = tempList.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] result = solution(arr);

        // 결과 출력
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
