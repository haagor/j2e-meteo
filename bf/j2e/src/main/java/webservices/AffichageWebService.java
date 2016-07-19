package webservices;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface AffichageWebService {

	@WebMethod
	@WebResult(name = "affiche") // utilise si return autre chose que void
	String afficheTemperature(String pos);

	@WebMethod
	@WebResult(name = "affiche") // utilise si return autre chose que void
	String afficheWind(String pos);

	@WebMethod
	@WebResult(name = "affiche") // utilise si return autre chose que void
	String afficheSnow(String pos);


	@WebMethod
	void test();

}
