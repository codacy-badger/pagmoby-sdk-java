package br.com.pagmoby.sdk.java.request;

public class PagMobyAccountRequest {

    private final String id;

    public PagMobyAccountRequest(String pagmobyAccount) {
        this.id = pagmobyAccount;
    }

    public String getId() {
        return id;
    }
}
