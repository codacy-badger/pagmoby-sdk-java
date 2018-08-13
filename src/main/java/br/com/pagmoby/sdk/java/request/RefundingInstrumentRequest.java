package br.com.pagmoby.sdk.java.request;

public class RefundingInstrumentRequest {

    private Method method;
    private BankAccountRequest bankAccount;

    public RefundingInstrumentRequest bankAccount(BankAccountRequest bankAccount) {
        this.method = Method.BANK_ACCOUNT;
        this.bankAccount = bankAccount;

        return this;
    }

    public RefundingInstrumentRequest pagmobyAccount() {
        this.method = Method.PAGMOBY_ACCOUNT;

        return this;
    }

    public RefundingInstrumentRequest creditCard() {
        this.method = Method.CREDIT_CARD;

        return this;
    }

    private enum Method {
        CREDIT_CARD, BANK_ACCOUNT, PAGMOBY_ACCOUNT
    }

    @Override
    public String toString() {
        return new StringBuilder("RefundingInstrumentRequest{")
            .append("method=").append(method)
            .append("bankAccount=").append(bankAccount)
            .append("}").toString();
    }
}
