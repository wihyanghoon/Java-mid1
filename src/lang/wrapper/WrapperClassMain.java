package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer IntegerObj = Integer.valueOf(10);
        Long LongObj = Long.valueOf(100);
        Double DoubleObj = Double.valueOf(1.0);

        System.out.println("newInteger = " + newInteger);
        System.out.println("IntegerObj = " + IntegerObj);
        System.out.println("LongObj = " + LongObj);
        System.out.println("DoubleObj = " + DoubleObj);

        System.out.println("내부값 읽기");
        int intValue = IntegerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = LongObj.longValue();
        System.out.println("longValue = " + longValue);

        double doubleValue = DoubleObj.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("비교");
        System.out.println("== " + (newInteger == IntegerObj));
        System.out.println("equals" + (newInteger.equals(IntegerObj)));
    }
}
