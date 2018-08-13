package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.resource.Key;

public class KeyAPI {

    private final Client client;

    public KeyAPI(final Client client) {
        this.client = client;
    }

    public Key get() {
        return client.get("/v2/keys", Key.class);
    }
}
