package nika.securitypractice.exception;

public class NicknameExistedException extends RuntimeException {

    public NicknameExistedException() {
    }

    public NicknameExistedException(String message) {
        super(message);
    }

    public NicknameExistedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NicknameExistedException(Throwable cause) {
        super(cause);
    }

    public NicknameExistedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
