/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagmoby.sdk.java;

import br.com.pagmoby.sdk.java.authentication.Authentication;
import br.com.pagmoby.sdk.java.authentication.BasicAuth;
import br.com.pagmoby.sdk.java.resource.Seller;

/**
 *
 * @author william-fernandes
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Authentication auth = new BasicAuth("contato@pagmoby.com.br", "pagmobypay2017");
        Client client = new Client(Client.PRODUCTION, auth);
        API api = new API(client);
        Seller seller = api.account().get("32d9cbbf1cae4be6b95741c8c46bb812");

        System.out.println("seller " + seller.getId());
    }

}
