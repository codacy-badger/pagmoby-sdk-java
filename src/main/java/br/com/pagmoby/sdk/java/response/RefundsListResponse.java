package br.com.pagmoby.sdk.java.response;

import br.com.pagmoby.sdk.java.resource.Refund;

import java.util.List;

public class RefundsListResponse {

    private List<Refund> refunds;

    public void setRefunds(List<Refund> refunds) { this.refunds = refunds; }

    public List<Refund> getRefunds() { return refunds; }

    @Override
    public String toString() {
        return new StringBuilder("RefundsListResponse{")
                .append("refunds=").append(refunds)
                .append('}').toString();
    }
}
