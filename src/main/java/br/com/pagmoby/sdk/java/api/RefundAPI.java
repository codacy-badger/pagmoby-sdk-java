package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.exception.ValidationException;
import br.com.pagmoby.sdk.java.request.RefundRequest;
import br.com.pagmoby.sdk.java.resource.Errors;
import br.com.pagmoby.sdk.java.resource.Refund;
import br.com.pagmoby.sdk.java.response.RefundsListResponse;

import java.util.List;

public class RefundAPI extends Endpoint {

    private final Client client;

    public RefundAPI(Client client) {
        this.client = client;
    }

    public Refund order(RefundRequest refundRequest) {
        return client.post(buildRefundEndpointForOrder(refundRequest), refundRequest, Refund.class);
    }

    public Refund payment(RefundRequest refundRequest) {
        return client.post(buildRefundEndpointForPayment(refundRequest), refundRequest, Refund.class);
    }

    public Refund get(String refundId) {
        return client.get(buildRefundEndpointForGet(refundId), Refund.class);
    }

    public RefundsListResponse list(String id) {
        if (id.startsWith("PAY-")) return client.get(buildRefundEndpointForListByPayment(id), RefundsListResponse.class);

        return client.get(buildRefundEndpointForListByOrder(id), RefundsListResponse.class);
    }
}
