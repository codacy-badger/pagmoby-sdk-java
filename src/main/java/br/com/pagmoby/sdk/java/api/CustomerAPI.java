package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.exception.ValidationException;
import br.com.pagmoby.sdk.java.request.CustomerRequest;
import br.com.pagmoby.sdk.java.resource.Customer;
import br.com.pagmoby.sdk.java.resource.FundingInstrument;

public class CustomerAPI {

    private final Client client;

    public CustomerAPI(Client client) {
        this.client = client;
    }

    public Customer create(CustomerRequest customer) {
        return client.post("/v2/customers", customer, Customer.class);
    }

    public Customer get(String externalId) {
        return client.get(String.format("/v2/customers/%s", externalId), Customer.class);
    }

    public FundingInstrument addCreditCard (CustomerRequest customer) {
        return client.post(String.format("/v2/customers/%s/fundinginstruments", customer.getId()), customer.getFundingInstrument(), FundingInstrument.class);
    }

    public Boolean deleteCreditCard (String creditCardId) {
        try {
            client.delete(String.format("/v2/fundinginstruments/%s", creditCardId), FundingInstrument.class);

            return true;
        } catch (ValidationException e) {
            if (e.getResponseCode() != 404) {
                throw new ValidationException(e.getResponseCode(), e.getResponseStatus(), e.getError());
            }
        }

        return false;
    }
}
