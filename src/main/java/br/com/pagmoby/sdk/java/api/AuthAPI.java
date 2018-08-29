package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.request.SellerRequest;
import br.com.pagmoby.sdk.java.resource.Seller;

public class AuthAPI {

    private final Client client;

    public AuthAPI(Client client) {
        this.client = client;
    }

    public Seller token(SellerRequest seller) {
        return client.post("/users/signin", seller, Seller.class);
    }
}
