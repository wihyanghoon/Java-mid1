package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaName {
    public static void main(String[] args) throws Exception {
        // 클래스조회
        Class clazz = String.class; // 1. 클래스에서 조회
        // Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
        // Class clazz2 = Class.forName("java.lang.string"); // 3. 문자열로 조회

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field);
        }

        // 모든 메서드 출력
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println("method: " + method);
        }

        // 상위 클래스 정보 출력
        System.out.println("Superclass: " + clazz.getSuperclass());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i);
        }
    }
}
