package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.Map;

public class MCCs {

    private static final String ENDPOINT = "/merchant_category_codes";
    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;

    /**
     * Listar MCCs (Merchant Category Codes)
     *
     * @HTTP GET
     * @url https://api.zoop.ws/users/{user_id}/permissions
     *
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> list(Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(ENDPOINT)
                .type(MCCs.class)
                .contentType(CONTENT_TYPE)
                .build();

        return requestMaker.doRequest(props);
    }

}
