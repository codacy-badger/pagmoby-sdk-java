package br.com.pagmoby.sdk.java.authentication;

import br.com.pagmoby.sdk.java.auth.Authentication;
import java.net.HttpURLConnection;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONObject;

public final class BasicAuth implements Authentication {

    private static final String AUTH_URL = "https://api.zoop.ws/v1/users/signin";

    private final String username;
    private final String password;
    private final String token;

    public BasicAuth(String username, String password) {
        this.username = username;
        this.password = password;
        this.token = this.getTokenApi();
    }

    public String getToken() {
        return token;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return password;
    }

    @Override
    public void authenticate(HttpURLConnection connection) {
        connection.setRequestProperty("Authorization", this.token);
    }

    private String getTokenApi() {
        JSONObject obj = new JSONObject();
        obj.put("username", this.username);
        obj.put("password", this.password);

        StringEntity entity = new StringEntity(obj.toJSONString(),
                ContentType.APPLICATION_JSON);

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(AUTH_URL);
        request.setEntity(entity);

        HttpResponse response = null;
        try {
            response = httpClient.execute(request);
        } catch (IOException ex) {
            Logger.getLogger(BasicAuth.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (response.getStatusLine().getStatusCode() == 200) {

            BufferedReader rd = null;
            try {
                rd = new BufferedReader(
                        new InputStreamReader(response.getEntity().getContent()));
            } catch (IOException | UnsupportedOperationException ex) {
                Logger.getLogger(BasicAuth.class.getName()).log(Level.SEVERE, null, ex);
            }

            StringBuilder result = new StringBuilder();
            String line;
            try {
                while ((line = rd.readLine()) != null) {
                    result.append(line);
                }
            } catch (IOException ex) {
                Logger.getLogger(BasicAuth.class.getName()).log(Level.SEVERE, null, ex);
            }

            JsonObject jsonObject = new JsonParser().parse(result.toString()).getAsJsonObject();
            return "Bearer " + jsonObject.get("token").getAsString();

        } else {
            return "";
        }
    }
    
}