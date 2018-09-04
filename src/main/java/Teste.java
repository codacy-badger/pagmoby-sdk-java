
import br.com.pagmoby.sdk.java.PagMoby;
import br.com.pagmoby.sdk.java.auth.Authentication;
import br.com.pagmoby.sdk.java.auth.BasicAuth;
import br.com.pagmoby.sdk.java.models.Setup;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author william-fernandes
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Authentication auth = new BasicAuth("cfcvicentepires@hotmail.com", "12345678");
        Setup setup = new Setup().setAuthentication(auth).setEnvironment(Setup.Environment.PRODUCTION);
        Map<String, Object> responseCreation = PagMoby.API.sellers().get("9d5dc851af7d452bb1bbfc0b856a4f14",setup);
   }

}
