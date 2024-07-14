package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    public static void action (Object obj) {
        // obj.move(); // 컴파일 오류, Object 클래스의 해당 메서든 존재하지 않음
        // obj.sound(); // 컴파일 오류, Object 클래스의 해당 메서든 존재하지 않음

        // 다운 캐스팅
        if(obj instanceof Dog dog) {
            dog.sound();
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
