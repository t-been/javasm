package op.varilable;

public class Var6 {
    public static void main(String[] args) {
        String str = "tb0219@naver.com";

        // 1. 전체 스트림 길이 출력
        int length = str.length();
        System.out.println(length);

        // 2. 메일의 아이디만 출력 tb0219
        int idx = str.indexOf("@");
        String id = str.substring(0, idx);
        System.out.println(id);

        // 3. 메일의 도메인만 출력 naver
        int idx2 = str.indexOf(".");
        String domain = str.substring(idx + 1, idx2);
        System.out.println(domain);

        // 4. 도메인 내용을 (naver.com) char array로 만들어 각 char 출력
        char[] arr = domain.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }
    }
}
