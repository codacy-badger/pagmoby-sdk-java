package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.models.User;
import br.com.pagmoby.sdk.java.models.Seller;

public class APIResources {

    private static Seller sellerInstance = new Seller();
    private static User customerInstance = new User();

    
    public static Seller sellers() {
        return sellerInstance;
    }

    
    public static User customers() {
        return customerInstance;
    }

}
