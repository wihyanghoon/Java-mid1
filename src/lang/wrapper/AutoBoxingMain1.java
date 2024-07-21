package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer BoxValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = BoxValue.intValue();

        System.out.println("Box value: " + BoxValue);
        System.out.println("Unboxed value: " + unboxedValue);
    }
}
