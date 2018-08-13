package br.com.pagmoby.sdk.java.resource;

public class Connect {

    private String accessToken;
    private ApiDate expires_in;
    private String scope;
    private PagMobyAccount pagmobyAccount;
    private String refreshToken;

    public ApiDate getExpiresIn() {
        return expires_in;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getScope() {
        return scope;
    }

    public PagMobyAccount getPagMobyAccount() {
        return pagmobyAccount;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Connect{");
        sb.append("accessToken='").append(accessToken).append('\'');
        sb.append(", expiresIn='").append(expires_in);
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", refreshToken='").append(refreshToken).append('\'');
        sb.append(", pagmobyAccount='").append(pagmobyAccount);
        sb.append('}');
        return sb.toString();
    }
}
