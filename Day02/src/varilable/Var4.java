package varilable;

public class Var4 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int result = a + b;
        System.out.println(result);

        String str = "Hello";
        System.out.println(str/*.toString()*/); // 자바에서는 이 부분이 생략가능
        String str2 = new String("Hello");
        System.out.println(str2);

        String str3 = "Hello";
        System.out.println(str3);

        String str4 = new String("Hello");
        System.out.println(str4);
    }
}
