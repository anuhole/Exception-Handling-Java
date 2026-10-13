public class BlockedAccountException extends Exception {
    public BlockedAccountException(String message) {
        super(message);
    }

    public BlockedAccountException() {
    }

    public BlockedAccountException(Throwable cause) {
        super(cause);
    }
}
