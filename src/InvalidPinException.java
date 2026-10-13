public class InvalidPinException extends RuntimeException {
    public InvalidPinException(String message) {
        super(message);
    }

    public InvalidPinException() {
    }

    public InvalidPinException(Throwable cause) {
        super(cause);
    }
}
