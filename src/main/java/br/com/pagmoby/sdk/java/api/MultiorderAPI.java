package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.request.MultiorderRequest;
import br.com.pagmoby.sdk.java.resource.Multiorder;

public class MultiorderAPI {

    private final Client client;

    public MultiorderAPI(final Client client) {
        this.client = client;
    }

    public Multiorder create(MultiorderRequest multiorder) {
        return client.post("/v2/multiorders", multiorder, Multiorder.class);
    }

    public Multiorder get(String multiorderId) {
        return client.get("/v2/multiorders/" + multiorderId, Multiorder.class);
    }
}
