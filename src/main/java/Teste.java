
import br.com.pagmoby.sdk.java.PagMoby;
import br.com.pagmoby.sdk.java.auth.Authentication;
import br.com.pagmoby.sdk.java.auth.BasicAuth;
import br.com.pagmoby.sdk.java.models.Setup;
import java.util.Map;
import static br.com.pagmoby.sdk.java.helpers.PayloadFactory.value;
import static br.com.pagmoby.sdk.java.helpers.PayloadFactory.payloadFactory;

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
        Authentication auth = new BasicAuth("usuario", "senha");
        Setup setup = new Setup().setAuthentication(auth).setEnvironment(Setup.Environment.PRODUCTION);

        Map<String, Object> phone = payloadFactory(
                value("email", "usuario@wiguiart.com"),
                value("username", "usuario@wiguiart.com"),
                value("first_name", "first_name"),
                value("last_name", "last_name"),
                value("taxpayer_id", "11111111111"),
                value("password", "12345678")
        );

        Map<String, Object> responseCreation = PagMoby.API.sellers().create(phone, setup);
    }

}
