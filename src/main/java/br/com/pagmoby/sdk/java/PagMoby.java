package br.com.pagmoby.sdk.java;


import br.com.pagmoby.sdk.java.api.APIResources;
import br.com.pagmoby.sdk.java.api.request.RequestMaker;
import java.io.InputStream;
import java.util.Properties;

public class PagMoby {


    public static final String PRODUCTION_URL = "https://api.zoop.ws/v1/marketplaces/fa34de127e634e10baa52883416130e6";
    public static final String AUTH_URL = "https://api.zoop.ws/v1/users/signin";

    private static String USER_AGENT;

    static {
        try {
            InputStream inputStream = RequestMaker.class.getResourceAsStream("/pagmobyJavaSDK.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            USER_AGENT = properties.getProperty("userAgent");
        } catch (Exception e) {
            USER_AGENT = "PagMobyJavaSDK/UnknownVersion (+https://github.com/pagmoby/pagmoby-sdk-java/)";
        }
    }

    /**
     * This method returns the {@code USER_AGENT} value.
     *
     * @return  {@code String}
     */
    protected String getUserAgent() { return USER_AGENT; }

    public static class API extends APIResources {}
}
