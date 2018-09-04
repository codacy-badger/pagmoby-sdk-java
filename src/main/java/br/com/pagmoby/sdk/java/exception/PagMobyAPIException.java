package br.com.pagmoby.sdk.java.exception;

public class PagMobyAPIException extends RuntimeException {

    /**
     * Default class constructor.
     */
    public PagMobyAPIException() {}

    /**
     * Constructor to receive the exception message.
     *
     * @param   message
     *          {@code String} exception message
     */
    public PagMobyAPIException(final String message) {
        super(message);
    }

    /**
     * Constructor to receive the exception cause.
     *
     * @param   cause
     *          {@code Throwable} exception cause.
     */
    public PagMobyAPIException(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructor to receive the exception message and cause.
     *
     * @param   message
     *          {@code String} exception message
     *
     * @param   cause
     *          {@code Throwable} exception cause
     */
    public PagMobyAPIException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor to receive the message and the cause of an exception
     * and to able the suppression and the writable stack trace.
     *
     * @param   message
     *          {@code String} exception message
     *
     * @param   cause
     *          {@code Throwable} exception cause
     *
     * @param   enableSuppression
     *          {@code boolean} exception suppression
     *
     * @param   writableStackTrace
     *          {@code boolean} exception stack trace
     */
    public PagMobyAPIException(final String message, final Throwable cause,
                            final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
