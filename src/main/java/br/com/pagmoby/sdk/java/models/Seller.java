package br.com.pagmoby.sdk.java.models;

public class Seller {

    private String id;
    private String username;
    private String password;
    private String resource;
    private String token;

    public String status;
    public String type;
    public String accountBalance;
    public String currentBalance;
    public String firstName;
    public String lastName;
    public String email;
    public Object description;
    public String taxpayerId;
    public String phoneNumber;
    public String birthdate;
    public String website;
    public String facebook;
    public String twitter;
    public Address address;
    public String statementDescriptor;
    public Object mcc;
    public Boolean showProfileOnline;
    public Boolean isMobile;
    public Boolean declineOnFailSecurityCode;
    public Boolean declineOnFailZipcode;
    public Boolean delinquent;
    public Object paymentMethods;
    public Object defaultDebit;
    public String defaultCredit;
    public String merchantCode;
    public String terminalCode;
    public String uri;
    public String marketplaceId;
    public Metadata metadata;
    public String createdAt;
    public String updatedAt;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public Object getMcc() {
        return mcc;
    }

    public void setMcc(Object mcc) {
        this.mcc = mcc;
    }

    public Boolean getShowProfileOnline() {
        return showProfileOnline;
    }

    public void setShowProfileOnline(Boolean showProfileOnline) {
        this.showProfileOnline = showProfileOnline;
    }

    public Boolean getIsMobile() {
        return isMobile;
    }

    public void setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
    }

    public Boolean getDeclineOnFailSecurityCode() {
        return declineOnFailSecurityCode;
    }

    public void setDeclineOnFailSecurityCode(Boolean declineOnFailSecurityCode) {
        this.declineOnFailSecurityCode = declineOnFailSecurityCode;
    }

    public Boolean getDeclineOnFailZipcode() {
        return declineOnFailZipcode;
    }

    public void setDeclineOnFailZipcode(Boolean declineOnFailZipcode) {
        this.declineOnFailZipcode = declineOnFailZipcode;
    }

    public Boolean getDelinquent() {
        return delinquent;
    }

    public void setDelinquent(Boolean delinquent) {
        this.delinquent = delinquent;
    }

    public Object getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(Object paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public Object getDefaultDebit() {
        return defaultDebit;
    }

    public void setDefaultDebit(Object defaultDebit) {
        this.defaultDebit = defaultDebit;
    }

    public String getDefaultCredit() {
        return defaultCredit;
    }

    public void setDefaultCredit(String defaultCredit) {
        this.defaultCredit = defaultCredit;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    

    @Override
    public String toString() {
        return "Seller{" + "id=" + id + ", username=" + username + ", password=" + password + ", resource=" + resource + ", token=" + token + '}';
    }

}
