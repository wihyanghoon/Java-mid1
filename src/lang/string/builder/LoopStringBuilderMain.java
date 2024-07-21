package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            result.append("Hello Java ");
        }
        long end = System.currentTimeMillis();

        System.out.println("result: " + result);
        System.out.println("time = " + (end - start) + "ms");
    }
}
