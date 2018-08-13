package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.api.filter.Pagination;
import br.com.pagmoby.sdk.java.request.InvoiceRequest;
import br.com.pagmoby.sdk.java.resource.Invoice;
import br.com.pagmoby.sdk.java.response.InvoiceListResponse;

import java.util.ArrayList;
import java.util.List;

public class InvoiceAPI {
    private final Client client;

    public InvoiceAPI(final Client client) {
        this.client = client;
    }

    public Invoice create(final InvoiceRequest invoice) {
        return client.post("/v2/invoices", invoice, Invoice.class);
    }

    public Invoice get(final String id) {
        return client.get("/v2/invoices/" + id, Invoice.class);
    }

    public InvoiceListResponse list() {
        return client.get("/v2/invoices", InvoiceListResponse.class);
    }

    public InvoiceListResponse list(final Pagination pagination) {
        if (pagination.getLimit() == 0)
            return client.get("/v2/invoices", InvoiceListResponse.class);
        if (pagination.getOffset() <= 0)
            return client.get("/v2/invoices?limit=" + pagination.getLimit(), InvoiceListResponse.class);
        return client.get("/v2/invoices?limit=" + pagination.getLimit() + "&offset=" + pagination.getOffset(), InvoiceListResponse.class);
    }
}