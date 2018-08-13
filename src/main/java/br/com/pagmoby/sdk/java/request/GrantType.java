package br.com.pagmoby.sdk.java.request;

public enum GrantType {
    AUTHORIZATION_CODE("authorization_code"),
    REFRESH_TOKEN("refresh_token");

    private String description;

    private GrantType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
