public class OverDrawnExpetion extends RuntimeException {
    public OverDrawnExpetion(String message) {
        super(message);
    }

    public OverDrawnExpetion() {
    }

    public OverDrawnExpetion(Throwable cause) {
        super(cause);
    }

}
