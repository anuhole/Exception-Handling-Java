package src;

public class PriceOutOfRangeException extends RuntimeException {
    public PriceOutOfRangeException(String message)
    {
        super(message);
    }

    public PriceOutOfRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PriceOutOfRangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public PriceOutOfRangeException() {
    }

    public PriceOutOfRangeException(Throwable cause) {
        super(cause);
    }
}
