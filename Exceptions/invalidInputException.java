package Exceptions;

public class invalidInputException extends RuntimeException {
    public invalidInputException() {
    }

    public invalidInputException(String message) {
        super(message);
    }

    public invalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public invalidInputException(Throwable cause) {
        super(cause);
    }
}
