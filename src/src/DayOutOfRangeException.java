package src;

public class DayOutOfRangeException extends RuntimeException {
    public DayOutOfRangeException(String message) {
        super(message);
    }

    public DayOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public DayOutOfRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DayOutOfRangeException() {
    }

    public DayOutOfRangeException(Throwable cause) {
        super(cause);
    }
}
