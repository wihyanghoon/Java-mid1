package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 1);
        Dog dog2 = new Dog("멍멍이2", 4);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
