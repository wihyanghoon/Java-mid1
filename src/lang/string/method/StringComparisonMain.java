package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "HELLO WORLD";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str3: " + str1.equalsIgnoreCase(str3));

        System.out.println("'b' compareTo 'c'" + "b".compareTo("a"));
        System.out.println("'str1' compareTo 'str2': " + str1.compareTo(str2));

        System.out.println("str1 starts with 'Hello':" + str1.startsWith("Hello"));
        System.out.println("str1 ends with 'World':" + str1.endsWith("World"));
    }
}
