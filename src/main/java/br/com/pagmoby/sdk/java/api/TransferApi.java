package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.api.filter.Pagination;
import br.com.pagmoby.sdk.java.request.TransferRequest;
import br.com.pagmoby.sdk.java.resource.Transfer;
import br.com.pagmoby.sdk.java.response.TransferListResponse;

public class TransferApi {

    private final Client client;
    private static final String TRANSFER_URL = "/v2/transfers";

    public TransferApi(final Client client) {
        this.client = client;
    }

    public Transfer create(final TransferRequest transfer) { return client.post(TRANSFER_URL, transfer, Transfer.class); }

    public Transfer reverse(final String id) { return client.post(TRANSFER_URL + "/" + id + "/reverse", Transfer.class); }

    public Transfer get(final String id) {
        return client.get(TRANSFER_URL + "/" + id, Transfer.class);
    }

    public TransferListResponse list() {
        return client.get(TRANSFER_URL, TransferListResponse.class);
    }

    public TransferListResponse list(final Pagination pagination) {
        if (pagination.getLimit() == 0)
            return client.get(TRANSFER_URL, TransferListResponse.class);
        if (pagination.getOffset() <= 0)
            return client.get(TRANSFER_URL + "?limit=" + pagination.getLimit(), TransferListResponse.class);
        return client.get(TRANSFER_URL + "?limit=" + pagination.getLimit() + "&offset=" + pagination.getOffset(), TransferListResponse.class);
    }


}
