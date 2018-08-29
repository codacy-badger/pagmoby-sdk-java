package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.exception.ValidationException;
import br.com.pagmoby.sdk.java.request.AccountRequest;
import br.com.pagmoby.sdk.java.resource.Account;
import br.com.pagmoby.sdk.java.resource.Seller;

public class SellerAPI {

    private final Client client;

    public SellerAPI(final Client client) {
        this.client = client;
    }

    public Seller get() {
        return client.get("/sellers", Seller.class);
    }

    public Seller get(String accountId) {
        return client.get("/sellers/" + accountId, Seller.class);
    }

    public Account create(AccountRequest account) {
        return client.post("/v2/accounts", account, Account.class);
    }

    /*
     * Method to check an account existence.
     *
     * StatusCode   ResponseBody    Method's response
     * @200         200             true                Exist
     * @400         400             false               Invalid
     * @404         404             false               Does Not Exist
     */
    public Boolean checkAccountExists(String taxDocument) {
        try {
            client.get("/v2/accounts/exists?tax_document=" + taxDocument, String.class);

            return true;
        } catch (ValidationException e) { return false; }
    }
}
