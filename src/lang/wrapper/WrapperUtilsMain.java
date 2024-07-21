package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체로 변환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int intValue = Integer.parseInt("10");


        //비교
        int compareResult = i1.compareTo(i2);
        System.out.println(compareResult);

        //산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
