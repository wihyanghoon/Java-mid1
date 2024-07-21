package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "Hello.txt";
        String fileName = str.substring(0, 5);
        String sxtName = str.substring(5, 9);

        System.out.println("fileName: " + fileName);
        System.out.println("sxtName: " + sxtName);
    }
}
