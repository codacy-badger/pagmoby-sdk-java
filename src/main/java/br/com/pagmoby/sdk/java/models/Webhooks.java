package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.Map;

public class Webhooks {

    private static final String ENDPOINT = "/v2/webhooks";
    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;

    /**
     * This method is used to get the data of a specific webhook sent from PagMoby by PagMoby
     * resource external ID.
     *
     * @param   resourceId
     *          {@code String} the PagMoby external ID of a resource (Orders, Payments, Refunds...).
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> get(String resourceId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(ENDPOINT + String.format("?resourceId=%s", resourceId))
                .type(Webhooks.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * This method is used to get all sent webhooks.
     *
     * @param   setup
     *          {@code Setup} the setup object.
     *
     * @return  {@code Map<String, Object>}
     */
    public Map<String, Object> list(Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(ENDPOINT)
                .type(Webhooks.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }
}
