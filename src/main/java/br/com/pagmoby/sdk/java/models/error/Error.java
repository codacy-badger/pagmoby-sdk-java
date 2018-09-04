/**
 * Read more <a href="https://dev.pagmoby.com.br/v2.0/reference#erros-1>API Reference</a>
 */
package br.com.pagmoby.sdk.java.models.error;

class Error {

    private String code;
    private String path;
    private String description;

    public String getCode() { return code; }

    public String getPath() { return path; }

    public String getDescription() { return description; }

    /**
     * This method receive the PagMoby error identifier code from ErrorBuilder class.
     *
     * @param   code
     *          {@code String} PagMoby error code
     */
    void setCode(String code) { this.code = code; }

    /**
     * This method receive the PagMoby error path from ErrorBuilder class.
     *
     * @param   path
     *          {@code String} PagMoby error path
     */
    void setPath(String path) { this.path = path; }

    /**
     * This method receive the PagMoby error description from ErrorBuilder class.
     *
     * @param   description
     *          {@code String} PagMoby error description
     */
    void setDescription(String description) { this.description = description; }
}
