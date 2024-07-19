package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println(isSame(str3, str4));

    }

    public static boolean isSame(String str1, String str2) {
        // 문자열 풀이 들어올지 인스턴스가 들어올지 모름
        //return str1 == str2;

        // String항상 동등성 비교를 해야한다.
        return str1.equals(str2);
    }
}
