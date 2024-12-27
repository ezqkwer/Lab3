public class DizzinessException extends RuntimeException {
    public DizzinessException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return " (DizzinessException: " + super.getMessage() + ")";
    }
}