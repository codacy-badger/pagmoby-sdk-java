package br.com.pagmoby.sdk.java.request;

public class MposRequest {
    private String pinpadId;

    public MposRequest PinpadId(String pinpadId){
        this.pinpadId = pinpadId;
        return this;
    }

    public String getPinpadId() {
        return pinpadId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MposRequest{");
        sb.append("pinpadId='").append(pinpadId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
