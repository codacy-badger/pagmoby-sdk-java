package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.Map;

public class Seller {

    private static final String ENDPOINT = "/sellers";
    private static final String INDIVIDUALS = "/individuals";
    private static final String BUSINESSES = "/businesses";

    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;

    /**
     * Criar novo vendedor do tipo indivíduo - Pessoa Física
     *
     * @HTTP POST
     * @url
     * https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/individuals
     *
     * @param setup {@code Setup} objeto de configuração.
     * @param body
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> createIndividuals(Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(ENDPOINT.concat(INDIVIDUALS))
                .body(body)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Alterar um vendedor do tipo indivíduo - Pessoa Física
     *
     * @HTTP PUT
     * @url
     * https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/individuals/id
     *
     * @param idSeller
     * @param setup {@code Setup} objeto de configuração.
     * @param body
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> updateIndividuals(String idSeller, Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("PUT")
                .endpoint(String.format("%s/%s/$s", ENDPOINT, INDIVIDUALS, idSeller))
                .body(body)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Criar novo vendedor do tipo indivíduo - Pessoa Jurídica
     *
     * @HTTP POST
     * @url
     * https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/businesses
     *
     * @param setup {@code Setup} objeto de configuração.
     * @param body
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> createBusinesses(Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(ENDPOINT.concat(BUSINESSES))
                .body(body)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Alterar um vendedor do tipo indivíduo - Pessoa Jurídica
     *
     * @HTTP PUT
     * @url
     * https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/businesses/id
     *
     * @param idSeller
     * @param setup {@code Setup} objeto de configuração.
     * @param body
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> updateBusinesses(String idSeller, Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("PUT")
                .endpoint(String.format("%s/%s/$s", ENDPOINT, BUSINESSES, idSeller))
                .body(body)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Recupera detalhes de vendedor pelo id
     *
     * @HTTP GET
     * @url https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/{id}
     *
     * @param id {@code String} user_id do usuário PagMoby
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> get(String id, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s", ENDPOINT, id))
                .type(User.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * Deleta um de vendedor pelo id
     *
     * @HTTP DELETE
     * @url https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/{id}
     *
     * @param id {@code String} user_id do usuário PagMoby
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> delete(String id, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("DELETE")
                .endpoint(String.format("%s/%s", ENDPOINT, id))
                .type(User.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * Listando vendedores
     *
     * @HTTP GET
     * @url https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers
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

    /**
     * Listando vendedores
     *
     * @HTTP GET
     * @url https://api.zoop.ws/v1/marketplaces/marketplace_id/sellers/search
     *
     * @param body {@code Setup} {"taxpayer_id": "cpf","ein": "CNPJ"
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> search(Setup setup,Map<String, Object> body) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(ENDPOINT.concat("search"))
                .body(body)
                .type(MCCs.class)
                .contentType(CONTENT_TYPE)
                .build();

        return requestMaker.doRequest(props);
    }

}
