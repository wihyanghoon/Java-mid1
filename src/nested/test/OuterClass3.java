package nested.test;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("hello");
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.hello();
    }
}
