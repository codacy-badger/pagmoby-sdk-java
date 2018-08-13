package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.api.filter.Filters;
import br.com.pagmoby.sdk.java.api.filter.Pagination;
import br.com.pagmoby.sdk.java.request.OrderRequest;
import br.com.pagmoby.sdk.java.resource.Order;
import br.com.pagmoby.sdk.java.response.OrderListResponse;
import br.com.pagmoby.sdk.java.util.QueryStringFactory;

import java.util.HashMap;
import java.util.Map;

public class OrderAPI {

    private final Client client;

    private static final String PATH = "/v2/orders";

    public OrderAPI(final Client client) {
        this.client = client;
    }

    public Order create(final OrderRequest order) {
        return client.post(PATH, order, Order.class);
    }

    public Order get(final String id) {
        return client.get(String.format("%s/%s", PATH, id), Order.class);
    }

    public OrderListResponse list() {
        return client.get(PATH, OrderListResponse.class);
    }

    public OrderListResponse list(final Pagination pagination) {
        String path = new QueryStringFactory(PATH, pagination, null, null).generate();

        return client.get(path, OrderListResponse.class);
    }

    public OrderListResponse list(final Filters filters) {
        return client.get(new QueryStringFactory(PATH, null, filters, null).generate(), OrderListResponse.class);
    }

    public OrderListResponse list(final String queryParam) {
        return client.get(new QueryStringFactory(PATH, null, null, hashParams(queryParam)).generate(), OrderListResponse.class);
    }

    public OrderListResponse list(final Pagination pagination, final Filters filters) {
        return client.get(new QueryStringFactory(PATH, pagination, filters, null).generate(), OrderListResponse.class);
    }

    public OrderListResponse list(final Pagination pagination, final String queryParam) {
        return client.get(new QueryStringFactory(PATH, pagination, null, hashParams(queryParam)).generate(), OrderListResponse.class);
    }

    public OrderListResponse list(final Filters filters, final String queryParam) {
        return client.get(new QueryStringFactory(PATH, null, filters, hashParams(queryParam)).generate(), OrderListResponse.class);
    }

    public OrderListResponse list(final Pagination pagination, final Filters filters, final String qParam) {
        return client.get(new QueryStringFactory(PATH, pagination, filters, hashParams(qParam)).generate(), OrderListResponse.class);
    }

    private Map<String, String> hashParams(final String queryParam) {
        return new HashMap<String, String>() {{
            put("q", queryParam);
        }};
    }
}