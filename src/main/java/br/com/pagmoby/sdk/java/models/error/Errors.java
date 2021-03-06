package br.com.pagmoby.sdk.java.models.error;

import java.util.ArrayList;
import java.util.List;

public class Errors {

    private final List<Error> errors = new ArrayList<>();

    public List<Error> getErrors() { return errors; }

    /**
     * This method adds a PagMoby error object to the errors list.
     *
     * @param   error
     *          {@code br.com.pagmoby.sdk.java.models.error.Error} object
     */
    public void setError(ErrorBuilder error) { this.errors.add(error); }
}
