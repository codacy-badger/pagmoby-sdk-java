package br.com.pagmoby.sdk.java.authentication;

import java.net.HttpURLConnection;

public interface Authentication {
	void authenticate(HttpURLConnection connection);
}