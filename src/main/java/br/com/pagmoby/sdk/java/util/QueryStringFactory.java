package br.com.pagmoby.sdk.java.util;

import br.com.pagmoby.sdk.java.api.filter.Filters;
import br.com.pagmoby.sdk.java.api.filter.Pagination;
import br.com.pagmoby.sdk.java.exception.PagMobyException;
import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;
import java.util.Map;

public class QueryStringFactory {

    private URIBuilder uri;
    private Pagination pagination;
    private Filters filters;
    private Map<String, String> params;

    public QueryStringFactory(String endpoint, Pagination pagination, Filters filters, Map<String, String> params) {
        try {
            this.uri = new URIBuilder(endpoint);
            this.pagination = pagination;
            this.filters = filters;
            this.params = params;
        } catch (URISyntaxException e) {
            throw new PagMobyException("Error trying to build URL: " + e.getMessage());
        }
    }

    private void addPagination() {
        if (pagination.getLimit() != 0) {
            uri.addParameter("limit", String.valueOf(pagination.getLimit()));
        }

        if (pagination.getOffset() >= 0) {
            uri.addParameter("offset", String.valueOf(pagination.getOffset()));
        }
    }

    private void addParams() {
        for (Map.Entry<String, String> entry : params.entrySet()) {
            uri.addParameter(entry.getKey(), entry.getValue());
        }
    }

    public String generate() {
        if (pagination != null) {
            this.addPagination();
        }

        if (filters != null) {
            uri.addParameter("filters", filters.toString());
        }

        if (params != null) {
            this.addParams();
        }

        return uri.toString();
    }

}
