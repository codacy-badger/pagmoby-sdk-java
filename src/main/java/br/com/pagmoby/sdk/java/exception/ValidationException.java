package br.com.pagmoby.sdk.java.exception;

import br.com.pagmoby.sdk.java.resource.Error;
import br.com.pagmoby.sdk.java.resource.Errors;

import java.util.List;

public class ValidationException extends PagMobyException {

    private final int responseCode;
    private final String responseStatus;
    private final Errors errors;

    public ValidationException(final int responseCode, final String responseStatus, final Errors errors) {
        this.responseCode = responseCode;
        this.responseStatus = responseStatus;
        this.errors = errors;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public Errors getError() {
        return errors;
    }

    public List<Error> getErrors() {
        return errors.getErrors();
    }
}
