package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();

        child.parentMethod();
        child.childMethod();

        // topString() Object 클래스의 메서드
        // 객체 (인스턴스)의 정보 제공
        String string = child.toString();
        System.out.println(string);
    }
}
