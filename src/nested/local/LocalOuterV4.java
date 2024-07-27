package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstantValue = 3;

    public Printer process(int paramVar) {
        // 스택 프레임 종료되는 순간 함께 제거된다.
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value: " + value);
                System.out.println("localVar: " + localVar);
                System.out.println("paramVar: " + paramVar);
                System.out.println("outInstantValue: " + outInstantValue);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면
        // localVar = 3;
        return localPrinter;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV2 = new LocalOuterV4();
        Printer printer = localOuterV2.process(1);
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();

        for (Field field : fields) {
            System.out.println("field: " + field);
        }
    }
}
