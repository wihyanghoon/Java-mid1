package exception.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendDate;

    public SendExceptionV4(String sendDate, String message) {
        super(message);
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return sendDate;
    }
}
