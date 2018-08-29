package br.com.pagmoby.sdk.java.resource;

public class Metadata {

    public String twitterId;
    public String facebookUserId;
    public String myOwnCustomerId;

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId;
    }

    public String getFacebookUserId() {
        return facebookUserId;
    }

    public void setFacebookUserId(String facebookUserId) {
        this.facebookUserId = facebookUserId;
    }

    public String getMyOwnCustomerId() {
        return myOwnCustomerId;
    }

    public void setMyOwnCustomerId(String myOwnCustomerId) {
        this.myOwnCustomerId = myOwnCustomerId;
    }


    
    // Falta Fazer a 
    @Override
    public String toString() {
        return new StringBuilder()
                .append('{')
                .append("twitterId='").append(twitterId).append('\'')
                .append(", facebookUserId='").append(facebookUserId).append('\'')
                .append(", myOwnCustomerId='").append(myOwnCustomerId).append('\'')
                .append('}').toString();
    }
}
