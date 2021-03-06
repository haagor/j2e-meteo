
package stubs.affichage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AffichageWebService", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AffichageWebService {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "test", targetNamespace = "http://webservices/", className = "stubs.affichage.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://webservices/", className = "stubs.affichage.TestResponse")
    public void test();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "affiche", targetNamespace = "")
    @RequestWrapper(localName = "afficheWind", targetNamespace = "http://webservices/", className = "stubs.affichage.AfficheWind")
    @ResponseWrapper(localName = "afficheWindResponse", targetNamespace = "http://webservices/", className = "stubs.affichage.AfficheWindResponse")
    public String afficheWind(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "affiche", targetNamespace = "")
    @RequestWrapper(localName = "afficheTemperature", targetNamespace = "http://webservices/", className = "stubs.affichage.AfficheTemperature")
    @ResponseWrapper(localName = "afficheTemperatureResponse", targetNamespace = "http://webservices/", className = "stubs.affichage.AfficheTemperatureResponse")
    public String afficheTemperature(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "affiche", targetNamespace = "")
    @RequestWrapper(localName = "afficheSnow", targetNamespace = "http://webservices/", className = "stubs.affichage.AfficheSnow")
    @ResponseWrapper(localName = "afficheSnowResponse", targetNamespace = "http://webservices/", className = "stubs.affichage.AfficheSnowResponse")
    public String afficheSnow(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
