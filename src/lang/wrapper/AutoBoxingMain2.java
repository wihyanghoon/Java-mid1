package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer BoxValue = value; // 오토 박싱

        // Wrapper -> Primitive
        int unboxedValue = BoxValue; // 오토 언박싱

        System.out.println("Box value: " + BoxValue);
        System.out.println("Unboxed value: " + unboxedValue);
    }
}
