package lang.system;

public class SystemMain {
    public static void main(String[] args) {
        // 현재시간 (밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);

        // 현재시간 (나노초)를 가져온다.
        long currentTimeNanos = System.nanoTime();
        System.out.println("currentTimeNanos: " + currentTimeNanos);

        // 환경 변수를 읽는다.
        System.out.println("getenv= " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties= " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copyArr = new char[5];

        System.arraycopy(originArr, 0, copyArr, 0, originArr.length);
        System.out.println("coyArr: " + copyArr);

        // 프로그램 종료
        System.exit(0);
        System.out.println("end");
    }
}
