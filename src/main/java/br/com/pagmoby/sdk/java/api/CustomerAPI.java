package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.exception.ValidationException;
import br.com.pagmoby.sdk.java.request.SellerRequest;
import br.com.pagmoby.sdk.java.resource.Seller;
import br.com.pagmoby.sdk.java.resource.FundingInstrument;

public class CustomerAPI {

    private final Client client;

    public CustomerAPI(Client client) {
        this.client = client;
    }

    public Seller create(SellerRequest customer) {
        return client.post("/sellers", customer, Seller.class);
    }

    public Seller get(String externalId) {
        return client.get(String.format("/customers/%s", externalId), Seller.class);
    }

    public Boolean deleteCreditCard (String creditCardId) {
        try {
            client.delete(String.format("/fundinginstruments/%s", creditCardId), FundingInstrument.class);

            return true;
        } catch (ValidationException e) {
            if (e.getResponseCode() != 404) {
                throw new ValidationException(e.getResponseCode(), e.getResponseStatus(), e.getError());
            }
        }

        return false;
    }
}
