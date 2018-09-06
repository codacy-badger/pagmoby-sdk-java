package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.Map;

public class Documents {

    private static final String ENDPOINT = "/sellers";
    private static final String DOCUMENTS = "/documents";
    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;

    /**
     * Criar documento de cadastro de vendedor
     *
     * @HTTP POST
     * @url https://api.zoop.ws/v1/marketplaces/{marketplace_id}/sellers/
     * {seller_id}/documents
     *
     * @param sellerId
     * @param body
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> create(String sellerId, Map<String, Object> body,
            Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(String.format("%s/%s/%s", ENDPOINT, sellerId, DOCUMENTS))
                .body(body)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Listar documentos de um vendedor
     *
     * @HTTP GET
     * @url https://api.zoop.ws/v1/marketplaces/{marketplace_id}/sellers/{seller_id}
     * /documents
     *
     * @param sellerId
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> list(String sellerId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s/%s", ENDPOINT, sellerId, DOCUMENTS))
                .type(User.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }
    

    /**
     * Atualiza os dados de um documento de um vendedor
     * 
     * @HTTP PUT
     * @url https://api.zoop.ws/v1/marketplaces/{marketplace_id}/sellers/documents/{id}
     *
     * @param idDocuments
     * @param body
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> update(String idDocuments,Map<String, Object> body,
            Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("PUT")
                .endpoint(String.format("%s/%s/%s", ENDPOINT,DOCUMENTS,idDocuments))
                .body(body)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

}
