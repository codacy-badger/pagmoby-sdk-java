package br.com.pagmoby.sdk.java.auth;

import static br.com.pagmoby.sdk.java.PagMoby.AUTH_URL;
import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import br.com.pagmoby.sdk.java.api.request.RequestProperties;
import br.com.pagmoby.sdk.java.api.request.RequestPropertiesBuilder;
import static br.com.pagmoby.sdk.java.helpers.PayloadFactory.payloadFactory;
import static br.com.pagmoby.sdk.java.helpers.PayloadFactory.value;
import br.com.pagmoby.sdk.java.models.Seller;
import br.com.pagmoby.sdk.java.models.Setup;
import java.net.HttpURLConnection;

import java.util.Map;
import org.apache.http.entity.ContentType;

public final class BasicAuth implements Authentication {

    private static final ContentType CONTENT_TYPE = ContentType.APPLICATION_JSON;

    private RequestMaker requestMaker;

    private String id;
    private String username;
    private String password;
    private String token;

    public BasicAuth(String username, String password) {
        this.username = username;
        this.password = password;
        this.token = getTokenApi();
    }

    @Override
    public void authenticate(HttpURLConnection connection) {
        connection.setRequestProperty("Authorization", token);
    }

    public String getTokenApi() {
        Map<String, Object> login = payloadFactory(
                value("username", username),
                value("password", password));

        Setup setup = new Setup().setAuthentication(null).setEnvironment(Setup.Environment.AUTH_URL);

        this.requestMaker = new RequestMaker(setup);
        RequestProperties props = new RequestPropertiesBuilder()
                .method("POST")
                .endpoint(AUTH_URL)
                .body(login)
                .type(Seller.class)
                .contentType(CONTENT_TYPE);

        Map<String, Object> auth = this.requestMaker.doRequest(props);
        this.setId(auth.get("id").toString());
        this.setToken(setBearer(auth.get("token").toString()));

        return setBearer(auth.get("token").toString());
    }

    private String setBearer(String token) {
        return "Bearer ".concat(token);
    }

    public RequestMaker getRequestMaker() {
        return requestMaker;
    }

    public void setRequestMaker(RequestMaker requestMaker) {
        this.requestMaker = requestMaker;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
