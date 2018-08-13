package br.com.pagmoby.sdk.java.resource;

public class TransferInstrument {

    private Method method;
    private BankAccount bankAccount;
    private PagMobyAccount pagmobyAccount;

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public PagMobyAccount getPagMobyAccount() {
        return pagmobyAccount;
    }

    public void setPagMobyAccount(PagMobyAccount pagmobyAccount) {
        this.pagmobyAccount = pagmobyAccount;
    }

    @Override
    public String toString() {

        return new StringBuilder("TransferInstrument{")
                .append("method=").append(method)
                .append(", bankAccount=").append(bankAccount)
                .append(", pagmobyAccount=").append(pagmobyAccount)
                .append('}').toString();

    }

    public enum Method {
        BANK_ACCOUNT, PAGMOBY_ACCOUNT;
    }
}
