package br.com.pagmoby.sdk.java.request;

public class TransferInstrumentRequest {

    private Method method;
    private BankAccountRequest bankAccount;
    private PagMobyAccountRequest pagmobyAccount;

    public TransferInstrumentRequest bankAccount(BankAccountRequest bankAccount) {
        this.method = Method.BANK_ACCOUNT;
        this.bankAccount = bankAccount;

        return this;
    }

    public TransferInstrumentRequest pagmobyAccount(PagMobyAccountRequest pagmobyAccount) {
        this.method = Method.PAGMOBY_ACCOUNT;
        this.pagmobyAccount = pagmobyAccount;

        return this;
    }

    public enum Method{
        BANK_ACCOUNT, PAGMOBY_ACCOUNT
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TransferInstrument{");
        sb.append("method=").append(method);
        sb.append(", bankAccount=").append(bankAccount);
        sb.append(", pagmobyAccount=").append(pagmobyAccount);
        sb.append('}');
        return sb.toString();
    }
}
