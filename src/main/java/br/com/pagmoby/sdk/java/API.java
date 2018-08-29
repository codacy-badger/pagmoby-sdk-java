package br.com.pagmoby.sdk.java;


import br.com.pagmoby.sdk.java.api.SellerAPI;

public class API {

    private final Client client;

    public API(final Client client) {
        this.client = client;
    }

    public SellerAPI account() {
        return new SellerAPI(client);
    }

}
