
import br.com.pagmoby.sdk.java.auth.Authentication;
import br.com.pagmoby.sdk.java.authentication.BasicAuth;
import br.com.pagmoby.sdk.java.models.Setup;

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
        Authentication auth = new BasicAuth("contato@pagmoby.com.br", "pagmobypay2017");
        Setup setup = new Setup().setAuthentication(auth).setEnvironment(Setup.Environment.PRODUCTION);

    }

}
