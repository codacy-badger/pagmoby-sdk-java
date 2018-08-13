package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import br.com.pagmoby.sdk.java.exception.PagMobyException;
import br.com.pagmoby.sdk.java.request.ConnectRequest;
import br.com.pagmoby.sdk.java.resource.Connect;
import br.com.pagmoby.sdk.java.resource.ScopePermissionList;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;

public class ConnectAPI {

    private final Client client;

    public ConnectAPI(final Client client) {
        this.client = client;
    }

    public String getAuthorizeUrl(String clientId, String redirectUri, ScopePermissionList scope) {

        try {
            URIBuilder b = new URIBuilder(client.getEndpoint() + "/oauth/authorize");
            b.addParameter("response_type", "code");
            b.addParameter("client_id", clientId);
            b.addParameter("redirect_uri", redirectUri);
            b.addParameter("scope", scope.toString());

            URL url = b.build().toURL();

            return url.toString();
        } catch (URISyntaxException e) {
            throw new PagMobyException("Error trying to build URL: " + e.getMessage());
        } catch (MalformedURLException e) {
            throw new PagMobyException("Error trying to build URL: " + e.getMessage());
        }

    }

    public Connect authorize(final ConnectRequest connectRequest) {
        return client.post("/oauth/token", connectRequest, Connect.class, ContentType.APPLICATION_FORM_URLENCODED);
    }
}
