package br.com.pagmoby.sdk.java.auth;

import java.net.HttpURLConnection;

public interface Authentication {

    void authenticate(HttpURLConnection connection);
}
