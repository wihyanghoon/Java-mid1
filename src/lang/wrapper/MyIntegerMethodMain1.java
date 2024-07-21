package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);

        int result1 = myInteger.compareTo(5);
        int result2 = myInteger.compareTo(10);
        int result3 = myInteger.compareTo(20);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
