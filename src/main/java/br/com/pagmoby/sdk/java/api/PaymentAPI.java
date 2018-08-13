package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.request.PaymentRequest;
import br.com.pagmoby.sdk.java.resource.Payment;

public class PaymentAPI {

    private final Client client;

    public PaymentAPI(final Client client) {
        this.client = client;
    }

    public Payment create(final PaymentRequest payment) {
        return client.post(String.format("/v2/orders/%s/payments", payment.getOrderId()), payment, Payment.class);
    }

    public Payment get(final String paymentId) {
        return client.get(String.format("/v2/payments/%s", paymentId), Payment.class);
    }

    public Payment capture(final String paymentId) {
        return client.post(String.format("/v2/payments/%s/capture", paymentId), null, Payment.class);
    }

    public Payment cancelPreAuthorized(final String paymentId) {
        return client.post(String.format("/v2/payments/%s/void", paymentId), null, Payment.class);
    }

}
