package br.com.pagmoby.sdk.java.api;

import java.util.Arrays;
import java.util.List;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.exception.ValidationException;
import br.com.pagmoby.sdk.java.request.BankAccountRequest;
import br.com.pagmoby.sdk.java.resource.BankAccount;

public class BankAccountsAPI {

    private final Client client;

    public BankAccountsAPI(final Client client) {
        this.client = client;
    }

    public BankAccount create(final String pagmobyAccount, final BankAccountRequest bankAccountRequest) {
        return client.post(String.format("/v2/accounts/%s/bankaccounts", pagmobyAccount), bankAccountRequest, BankAccount.class);
    }

    public BankAccount get(final String id) {
        return client.get(String.format("/v2/bankaccounts/%s", id), BankAccount.class);
    }

    public List<BankAccount> getList(final String pagmobyAccount) {
        BankAccount[] bankAccounts = client.get(String.format("/v2/accounts/%s/bankaccounts", pagmobyAccount), BankAccount[].class);

        return Arrays.asList(bankAccounts);
    }
    
    public BankAccount update(final String id, final BankAccountRequest bankAccountRequest) {
    	return client.put(String.format("/v2/bankaccounts/%s", id), bankAccountRequest, BankAccount.class);
    }
    
    public Boolean delete(final String id) {
    	try {
            client.delete(String.format("/v2/bankaccounts/%s", id), BankAccount.class);
	    	
            return true;
    	} catch (ValidationException e) {
    	    if (e.getResponseCode() != 404) {
                throw new ValidationException(e.getResponseCode(), e.getResponseStatus(), e.getError());
            }
    	}
    	return false;
    }
    

}
