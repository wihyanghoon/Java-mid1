package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr = {new MyInteger(1), new MyInteger(2), new MyInteger(3)};

        System.out.println(finValue(intArr,-1));
        System.out.println(finValue(intArr,0));
        System.out.println(finValue(intArr,1));
        System.out.println(finValue(intArr,100));
    }

    private static MyInteger finValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
    }
}
