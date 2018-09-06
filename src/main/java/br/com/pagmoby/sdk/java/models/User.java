package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.Map;

public class User {

    private static final String ENDPOINT = "/users";
    private static final String ENDPOINT_PERMISSIONS = "/permissions";
    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;

    /**
     * Criar novo usuário de API por marketplace
     *
     * @HTTP POST
     * @url https://api.zoop.ws/v1/marketplaces/{marketplace_id}/users
     * 
     * @param body
     * @param setup {@code Setup} objeto de configuração.
     * 
     * @return {@code Map<String, Object}
     */
    public Map<String, Object> create(Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(ENDPOINT)
                .body(body)
                .type(User.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Relizar login por usuário/senha
     *
     * @HTTP POST
     * @url https://api.zoop.ws/v1/users/signin
     * 
     * @body Seller} {"username": "","password": ""}
     * @param body
     * @param setup {@code Setup} objeto de configuração.
     * 
     * @return {@code Map<String, Object}
     */
    public Map<String, Object> login(Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(ENDPOINT.concat("/signin"))
                .body(body)
                .type(User.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Alterar detalhes de usuário
     *
     * @HTTP PUT
     * @url https://api.zoop.ws/v1/users/{user_id}
     * 
     * @param body
     * @param setup {@code Setup} objeto de configuração.
     * 
     * @return {@code Map<String, Object}
     */
    public Map<String, Object> update(Map<String, Object> body, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("PUT")
                .endpoint(ENDPOINT)
                .endpoint(String.format("%s/%s", ENDPOINT, body.get("id")))
                .body(body)
                .type(User.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Este método é usado para obter os dados de um usuário criado pelo usuário
     * PagMoby external ID.
     *
     * @HTTP GET
     * @url https://api.zoop.ws/v1/users/{user_id}
     * 
     * @param userId {@code String} user_id do usuário PagMoby
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> get(String userId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s", ENDPOINT, userId))
                .type(User.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * Remover usuário
     *
     * @HTTP DELETE
     * @url https://api.zoop.ws/v1/users/{user_id}
     * 
     * @param userId {@code String} user_id do usuário PagMoby
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> delete(String userId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("DELETE")
                .endpoint(String.format("%s/%s", ENDPOINT, userId))
                .type(User.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }
}
