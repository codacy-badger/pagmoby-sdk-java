package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.List;
import java.util.Map;

public class Accounts {

    private static final String ENDPOINT = "/v2/accounts";
    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;

    /**
     * This method is used to validate the argument of bellow method, if probably it's a tax document or not.
     *
     * @param   argument
     *          {@code String} the received argument.
     *
     * @return  {@code boolean}
     */
    private boolean isTaxDocument(String argument) {
        try {
            Integer.parseInt(argument.substring(0,1));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    /**
     * This method allows you to check if a person already has a PagMoby account, by it's tax document or e-mail.
     * The tax document must be write with punctuation, for example: 123.456.789-00.
     *
     * @param   argument
     *          {@code String} the person's tax document or e-mail.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> checkExistence(String argument, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        String argumentType;

        if (isTaxDocument(argument)) argumentType = "tax_document";

        else argumentType = "email";

        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/exists?%s=%s", ENDPOINT, argumentType, argument))
                .type(Accounts.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * This method allows you to create a PagMoby account (classical or transparent). To differentiate the
     * two accounts types you have to set the boolean attribute {@code transparentAccount}, <b>true</b> value
     * (you will create a transparent accounts) or <b>false</b> value (you will create a classical accounts).
     *
     * @param   body
     *          {@code Map<String, Object>} the request body.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> create(Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(ENDPOINT)
                .body(body)
                .type(Accounts.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * This method is used to get a created accounts by PagMoby account external ID.
     *
     * @param   id
     *          {@code String} the PagMoby account external ID.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> get(String id, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s", ENDPOINT, id))
                .type(Accounts.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * This method is used to get the Basic Auth keys and the public key of a PagMoby account.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> getKeys(Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint("/v2/keys")
                .type(Accounts.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * This method allows you to create a bank account to a PagMoby account. You can use a bank account to make
     * transfers and refunds on PagMoby.
     *
     * @param   body
     *          {@code Map<String, Object>} the request body.
     *
     * @param   pagmobyAccountId
     *          {@code String} the PagMoby account external ID.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> createBankAccount(Map<String, Object> body, String pagmobyAccountId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(String.format("%s/%s/bankaccounts", ENDPOINT, pagmobyAccountId))
                .body(body)
                .type(Accounts.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * This method allows you to list all bank account of a PagMoby account.
     *
     * @param   pagmobyAccountId
     *          {@code String} the PagMoby account external ID.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public List<Map<String, Object>> listBankAccounts(String pagmobyAccountId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s/bankaccounts", ENDPOINT, pagmobyAccountId))
                .type(BankAccounts.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.getList(props);
    }
}
