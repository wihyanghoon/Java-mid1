package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {

        int iterations = 1_00_000_000; // 10억
        long start, end;


        start = System.currentTimeMillis();
        // 기본형 long
        int sum1 = 0;
        for (int i = 0; i < iterations; i++) {
            sum1 = sum1 + i;
        }
        end = System.currentTimeMillis();
        System.out.println("sum1 = " + sum1);
        System.out.println("실행 시간 : " + (end - start) + "ms");

        // 래퍼 클래스 long 사용

        start = System.currentTimeMillis();
        Long sum2 = 0L;
        for (int i = 0; i < iterations; i++) {
            sum2 = sum2 + i;
        }
        end = System.currentTimeMillis();
        System.out.println("sum2 = " + sum2);
        System.out.println("Wrapper class 실행 시간 : " + (end - start) + "ms");
    }
}
