package br.com.pagmoby.sdk.java.models;

import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import org.apache.http.entity.ContentType;

import java.util.Map;

public class Permission {

    private static final String ENDPOINT_USER = "/users";
    private static final String ENDPOINT_PERMISSIONS = "/permissions";
    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;
    private RequestMaker requestMaker;
       
     /**
     * Permissão do usuário
     * Busca todas as permissões que usuário possui pelo user_id
     * 
     * @HTTP GET
     * @url https://api.zoop.ws/users/{user_id}/permissions
     * 
     * @param userId {@code String} user_id do usuário PagMoby
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> getPermissionUser(String userId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s", userId, ENDPOINT_PERMISSIONS))
                .type(Permission.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * Criar permissão para usuário
     * Cria uma nova permissão para o usuário, podendo vincular à marketplace,
     * seller ou grupo
     *
     * @HTTP POST
     * @url https://api.zoop.ws/users/{user_id}/permissions
     * 
     * @param userId
     * @param body
     * @param setup {@code Setup} objeto de configuração.
     * 
     * @return {@code Map<String, Object}
     */
    public Map<String, Object> createPermission(String userId,
            Map<String, Object> body,
            Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(String.format("%s/%s/$s", ENDPOINT_USER, userId, 
                        ENDPOINT_PERMISSIONS))
                .body(body)
                .type(Permission.class)
                .contentType(CONTENT_TYPE);

        return this.requestMaker.doRequest(props);
    }

    /**
     * Permissão do usuário por permission_id
     * Permissões que usuário possui pelo permission_id
     *
     * @HTTP GET
     * @url https://api.zoop.ws/users/{user_id}/permissions/{permission_id}
     * 
     * @param userId {@code String} user_id do usuário PagMoby
     * @param permissionId
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> getPermissionId(String userId, String permissionId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("GET")
                .endpoint(String.format("%s/%s/%s", userId, ENDPOINT_PERMISSIONS,
                        permissionId))
                .type(Permission.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }

    /**
     * Deleta uma permissão
     * Remove uma permissões do usuário pelo permission_id
     *
     * @HTTP DELETE
     * @url https://api.zoop.ws/users/{user_id}/permissions/{permission_id}
     * 
     * @param userId {@code String} user_id do usuário PagMoby
     * @param permissionId
     * @param setup {@code Setup} objeto de configuração.
     *
     * @return {@code Map<String, Object>}.
     */
    public Map<String, Object> deletePermission(String userId, String permissionId, Setup setup) {
        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("DELETE")
                .endpoint(String.format("%s/%s/%s", userId, ENDPOINT_PERMISSIONS,
                        permissionId))
                .type(Permission.class)
                .contentType(CONTENT_TYPE)
                .build();

        return this.requestMaker.doRequest(props);
    }
}
