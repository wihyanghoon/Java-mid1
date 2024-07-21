package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@gamil.com";

        String[] parts = email.split("@");
        String id = parts[0];
        String domain = parts[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
