package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {
    private final String sendDate;

    public SendExceptionV3(String sendDate, String message) {
        super(message);
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return sendDate;
    }
}
