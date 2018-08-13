package br.com.pagmoby.sdk.java.request;

public class ReceiverRequest {
    private ReceiverTypeRequest type;
    private PagMobyAccountRequest pagmobyAccount;
    private AmountRequest amount;
    private boolean feePayor;

    public ReceiverRequest primary(final String pagmobyAccount, final AmountRequest amountRequest) {
        defaultAttributes(ReceiverTypeRequest.PRIMARY, pagmobyAccount, amountRequest, true);

        return this;
    }

    public ReceiverRequest primary(final String pagmobyAccount, final AmountRequest amountRequest, boolean feePayor) {
        defaultAttributes(ReceiverTypeRequest.PRIMARY, pagmobyAccount, amountRequest, feePayor);

        return this;
    }

    public ReceiverRequest secondary(final String pagmobyAccount, final AmountRequest amountRequest) {
        defaultAttributes(ReceiverTypeRequest.SECONDARY, pagmobyAccount, amountRequest, false);

        return this;
    }

    public ReceiverRequest secondary(final String pagmobyAccount, final AmountRequest amountRequest, boolean feePayor) {
        defaultAttributes(ReceiverTypeRequest.SECONDARY, pagmobyAccount, amountRequest, feePayor);

        return this;
    }

    private void defaultAttributes(ReceiverTypeRequest receiverTypeRequest, String pagmobyAccount, AmountRequest amountRequest, boolean feePayor) {
        this.type = receiverTypeRequest;
        this.pagmobyAccount = new PagMobyAccountRequest(pagmobyAccount);
        this.amount = amountRequest;
        this.feePayor = feePayor;
    }

    public ReceiverTypeRequest getType() {
        return type;
    }

    public PagMobyAccountRequest getPagMobyAccount() {
        return pagmobyAccount;
    }

    public AmountRequest getAmount() {
        return amount;
    }

    public boolean getFeePayor() {
        return feePayor;
    }
}
