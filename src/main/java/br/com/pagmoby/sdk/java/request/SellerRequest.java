package br.com.pagmoby.sdk.java.request;

public class SellerRequest {

     private String id;
    private String username;
    private String password;
    private String resource;
    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", username=" + username + ", password=" + password + ", resource=" + resource + ", token=" + token + '}';
    }

    
}
