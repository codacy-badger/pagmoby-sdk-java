package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
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

}
