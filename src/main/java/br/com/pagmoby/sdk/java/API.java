package br.com.pagmoby.sdk.java;


import br.com.pagmoby.sdk.java.api.SellerAPI;
import br.com.pagmoby.sdk.java.api.InvoiceAPI;
import br.com.pagmoby.sdk.java.api.OrderAPI;
import br.com.pagmoby.sdk.java.api.PaymentAPI;
import br.com.pagmoby.sdk.java.api.CustomerAPI;
import br.com.pagmoby.sdk.java.api.ConnectAPI;
import br.com.pagmoby.sdk.java.api.NotificationPreferencesAPI;
import br.com.pagmoby.sdk.java.api.RefundAPI;
import br.com.pagmoby.sdk.java.api.MultiorderAPI;
import br.com.pagmoby.sdk.java.api.MultipaymentAPI;
import br.com.pagmoby.sdk.java.api.BankAccountsAPI;
import br.com.pagmoby.sdk.java.api.EscrowAPI;
import br.com.pagmoby.sdk.java.api.TransferApi;
import br.com.pagmoby.sdk.java.api.EntryAPI;
import br.com.pagmoby.sdk.java.api.BalancesAPI;

public class API {

    private final Client client;

    public API(final Client client) {
        this.client = client;
    }

    public OrderAPI order() {
        return new OrderAPI(client);
    }

    public PaymentAPI payment() {
        return new PaymentAPI(client);
    }

    public InvoiceAPI invoice() {
        return new InvoiceAPI(client);
    }

    public SellerAPI account() {
        return new SellerAPI(client);
    }

    public CustomerAPI customer() {
        return new CustomerAPI(client);
    }

    public ConnectAPI connect() {
        if (client.getEndpoint() == null ? Client.PRODUCTION == null : client.getEndpoint().equals(Client.PRODUCTION)) {
            return new ConnectAPI(new Client(Client.PRODUCTION, client.getAuthentication()));
        }

        return new ConnectAPI(new Client(Client.PRODUCTION, client.getAuthentication()));
    }

    public NotificationPreferencesAPI notification() {
        return new NotificationPreferencesAPI(client);
    }

    public RefundAPI refund() {
        return new RefundAPI(client);
    }

    public MultiorderAPI multiorder(){
        return new MultiorderAPI(client);
    }

    public MultipaymentAPI multipayment() {
        return new MultipaymentAPI(client);
    }

    public BankAccountsAPI bankAccount() {
        return new BankAccountsAPI(client);
    }

    public EscrowAPI escrow() {
        return new EscrowAPI(client);
    }

    public TransferApi transfer() {
        return new TransferApi(client);
    }

    public EntryAPI entry() { return new EntryAPI(client); }

    public BalancesAPI balance() { return new BalancesAPI(client); }
}
