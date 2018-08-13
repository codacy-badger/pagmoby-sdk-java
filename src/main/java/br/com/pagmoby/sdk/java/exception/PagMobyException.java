package br.com.pagmoby.sdk.java.exception;

public class PagMobyException extends RuntimeException {

    public PagMobyException() {
    }

    public PagMobyException(final String message) {
        super(message);
    }

    public PagMobyException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PagMobyException(final Throwable cause) {
        super(cause);
    }

    public PagMobyException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
