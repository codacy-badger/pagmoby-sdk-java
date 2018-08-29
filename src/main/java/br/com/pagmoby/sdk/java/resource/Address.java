package br.com.pagmoby.sdk.java.resource;

public class Address {

    public String line1;
    public String line2;
    public String line3;
    public String neighborhood;
    public String city;
    public String state;
    public String postalCode;
    public String countryCode;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Object getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    // Falta Fazer a 
    @Override
    public String toString() {
        return new StringBuilder()
                .append('{')
                .append("line1='").append(line1).append('\'')
                .append(", line2='").append(line2).append('\'')
                .append(", line3='").append(line3).append('\'')
                .append(", city='").append(city).append('\'')
                .append(", neighborhood='").append(neighborhood).append('\'')
                .append(", city='").append(city).append('\'')
                .append(", state='").append(state).append('\'')
                .append(", postalCode='").append(postalCode).append('\'')
                .append('}').toString();
    }
}
