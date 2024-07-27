package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstatnceValue = 2;

    static class Nested {
        private int nestedInsatanceValue = 1;

        public void print() {
            System.out.println(nestedInsatanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근 할 수 없다.
            // System.out.println(outInstatnceValue);

            // 바깥 클래스의 클래스 멤버에는 접근 할 수 있다.
            System.out.println(outClassValue);
        }
    }
}
