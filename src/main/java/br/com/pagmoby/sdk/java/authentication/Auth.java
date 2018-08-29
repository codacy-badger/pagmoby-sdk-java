package br.com.pagmoby.sdk.java.authentication;

import java.net.HttpURLConnection;

public class Auth implements Authentication {
	private final String accessToken;

	public Auth(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getAccessToken() {
		return accessToken;
	}

        @Override
	public void authenticate(HttpURLConnection connection) {
		connection.addRequestProperty("Authorization", "Bearer " + "N2RmY2QyMTItZDlhMC00NjFhLWE5ZTgtNDk3NGNkODQ4Nzli");
	}
}
