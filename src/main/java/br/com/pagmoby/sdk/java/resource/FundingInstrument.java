package br.com.pagmoby.sdk.java.resource;

public class FundingInstrument {
    private boolean suppressCreditCard;
    private boolean suppressBoleto;
    private Method method;
    private CreditCard creditCard;
    private Boleto boleto;
    private OnlineBankDebit onlineBankDebit;
    private Mpos mpos;

    public boolean isSuppressCreditCard() {
        return suppressCreditCard;
    }

    public boolean isSuppressBoleto() {
        return suppressBoleto;
    }

    public void setSuppressCreditCard(boolean suppressCreditCard) {
        this.suppressCreditCard = suppressCreditCard;
    }

    public void setSuppressBoleto(boolean suppressBoleto) {
        this.suppressBoleto = suppressBoleto;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public Mpos getMpos() {
        return mpos;
    }

    public void setMpos(Mpos mpos) {
        this.mpos = mpos;
    }

    public OnlineBankDebit getOnlineBankDebit() {
        return onlineBankDebit;
    }

    public void setOnlineBankDebit(OnlineBankDebit onlineBankDebit) {
        this.onlineBankDebit = onlineBankDebit;
    }

    public enum Method {
        CREDIT_CARD, BOLETO, ONLINE_BANK_DEBIT;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FundingInstrument{");
        sb.append("suppressCreditCard=").append(suppressCreditCard);
        sb.append(", suppressBoleto=").append(suppressBoleto);
        sb.append(", method=").append(method);
        sb.append(", creditCard=").append(creditCard);
        sb.append(", boleto=").append(boleto);
        sb.append(", mpos=").append(mpos);
        sb.append(", onlineBankDebit=").append(onlineBankDebit);
        sb.append('}');
        return sb.toString();
    }
}
