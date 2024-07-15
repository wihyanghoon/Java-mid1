package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("동일성 : " + (user1 == user2));
        System.out.println("동등성 : " +(user1.equals(user2)));
    }
}
