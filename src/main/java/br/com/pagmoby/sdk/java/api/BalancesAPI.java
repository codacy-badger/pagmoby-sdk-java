package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.API;
import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.resource.Balances;

public class BalancesAPI {

    private final Client client;

    private final String BALANCE_ENDPOINT = "/v2/balances";

    private final String API_VERSION = "2.1";

    public BalancesAPI(final Client client) { this.client = client; }

    public Balances get() { return client.get(BALANCE_ENDPOINT, Balances.class, API_VERSION); }
}