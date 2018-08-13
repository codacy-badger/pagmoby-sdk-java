package br.com.pagmoby.sdk.java.response;

import br.com.pagmoby.sdk.java.resource.Links;
import br.com.pagmoby.sdk.java.resource.Order;
import br.com.pagmoby.sdk.java.resource.invoice.Summary;

import java.util.List;

public class OrderListResponse {

    public static final String NEXT = "next";
    public static final String PREVIOUS = "previous";

    private List<Order> orders;
    private Summary summary;
    private Links links;

    public String next() {
        return links.getLinks().get(NEXT).toString();
    }

    public String previous() {
        return links.getLinks().get(PREVIOUS).toString();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return new StringBuilder("OrderListResponse{")
                .append("summary=").append(summary)
                .append(", orders=").append(orders)
                .append('}').toString();
    }
}
