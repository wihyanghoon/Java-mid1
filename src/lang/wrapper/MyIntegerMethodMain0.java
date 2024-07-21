package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value = 10;

        int result1 = compareTo(value, 5);
        int result2 = compareTo(value, 10);
        int result3 = compareTo(value, 20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }

    public static int compareTo(int value, int target) {
        if(value < target) {
            return -1;
        } else if(value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
