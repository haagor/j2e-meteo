
package stubs.affichage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AffichageWebServiceImplService", targetNamespace = "http://polytech.unice.fr/si/4a/isa/bf", wsdlLocation = "file:///home/user/SI4/ski3000/git/bf/client/src/main/resources/AffichageWS.wsdl")
public class AffichageWebServiceImplService
    extends Service
{

    private final static URL AFFICHAGEWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AFFICHAGEWEBSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName AFFICHAGEWEBSERVICEIMPLSERVICE_QNAME = new QName("http://polytech.unice.fr/si/4a/isa/bf", "AffichageWebServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:///home/user/SI4/ski3000/git/bf/client/src/main/resources/AffichageWS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AFFICHAGEWEBSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        AFFICHAGEWEBSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public AffichageWebServiceImplService() {
        super(__getWsdlLocation(), AFFICHAGEWEBSERVICEIMPLSERVICE_QNAME);
    }

    public AffichageWebServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AFFICHAGEWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public AffichageWebServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, AFFICHAGEWEBSERVICEIMPLSERVICE_QNAME);
    }

    public AffichageWebServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AFFICHAGEWEBSERVICEIMPLSERVICE_QNAME, features);
    }

    public AffichageWebServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AffichageWebServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AffichageWebService
     */
    @WebEndpoint(name = "AffichageWebServiceImplPort")
    public AffichageWebService getAffichageWebServiceImplPort() {
        return super.getPort(new QName("http://polytech.unice.fr/si/4a/isa/bf", "AffichageWebServiceImplPort"), AffichageWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AffichageWebService
     */
    @WebEndpoint(name = "AffichageWebServiceImplPort")
    public AffichageWebService getAffichageWebServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://polytech.unice.fr/si/4a/isa/bf", "AffichageWebServiceImplPort"), AffichageWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AFFICHAGEWEBSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw AFFICHAGEWEBSERVICEIMPLSERVICE_EXCEPTION;
        }
        return AFFICHAGEWEBSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
