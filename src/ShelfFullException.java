public class ShelfFullException extends Exception {
    public ShelfFullException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return " (ShelfFullException: " + super.getMessage() + ")";
    }
}