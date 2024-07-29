package exception.basic.unchecked;

public class Client {
    public void call() {
        throw new MyUnCheckedException("ex");
    }
}
