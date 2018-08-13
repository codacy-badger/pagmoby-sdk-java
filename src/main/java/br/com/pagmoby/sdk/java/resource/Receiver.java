package br.com.pagmoby.sdk.java.resource;

public class Receiver {

    private Amount amount;
    private Type type;
    private PagMobyAccount pagmobyAccount;
    private boolean feePayor;

    public Amount getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public PagMobyAccount getPagMobyAccount() {
        return pagmobyAccount;
    }

    public boolean getFeePayor() {
        return feePayor;
    }

    public boolean isPrimary() {
        return Type.PRIMARY == getType();
    }

    public boolean isSecondary() {
        return Type.SECONDARY == getType();
    }

    @Override
    public String toString() {
        return new StringBuilder("Receiver{")
                .append("amount=").append(amount)
                .append(", type=").append(type)
                .append(", pagmobyAccount=").append(pagmobyAccount)
                .append('}').toString();
    }

    public enum Type {
        PRIMARY, SECONDARY;
    }
}
