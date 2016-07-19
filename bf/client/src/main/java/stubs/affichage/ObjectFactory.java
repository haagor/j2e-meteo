
package stubs.affichage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the stubs.affichage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AfficheWindResponse_QNAME = new QName("http://webservices/", "afficheWindResponse");
    private final static QName _AfficheTemperatureResponse_QNAME = new QName("http://webservices/", "afficheTemperatureResponse");
    private final static QName _AfficheSnow_QNAME = new QName("http://webservices/", "afficheSnow");
    private final static QName _TestResponse_QNAME = new QName("http://webservices/", "testResponse");
    private final static QName _Test_QNAME = new QName("http://webservices/", "test");
    private final static QName _AfficheWind_QNAME = new QName("http://webservices/", "afficheWind");
    private final static QName _AfficheTemperature_QNAME = new QName("http://webservices/", "afficheTemperature");
    private final static QName _AfficheSnowResponse_QNAME = new QName("http://webservices/", "afficheSnowResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: stubs.affichage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AfficheSnowResponse }
     * 
     */
    public AfficheSnowResponse createAfficheSnowResponse() {
        return new AfficheSnowResponse();
    }

    /**
     * Create an instance of {@link AfficheTemperature }
     * 
     */
    public AfficheTemperature createAfficheTemperature() {
        return new AfficheTemperature();
    }

    /**
     * Create an instance of {@link AfficheWind }
     * 
     */
    public AfficheWind createAfficheWind() {
        return new AfficheWind();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link AfficheSnow }
     * 
     */
    public AfficheSnow createAfficheSnow() {
        return new AfficheSnow();
    }

    /**
     * Create an instance of {@link AfficheTemperatureResponse }
     * 
     */
    public AfficheTemperatureResponse createAfficheTemperatureResponse() {
        return new AfficheTemperatureResponse();
    }

    /**
     * Create an instance of {@link AfficheWindResponse }
     * 
     */
    public AfficheWindResponse createAfficheWindResponse() {
        return new AfficheWindResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheWindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "afficheWindResponse")
    public JAXBElement<AfficheWindResponse> createAfficheWindResponse(AfficheWindResponse value) {
        return new JAXBElement<AfficheWindResponse>(_AfficheWindResponse_QNAME, AfficheWindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheTemperatureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "afficheTemperatureResponse")
    public JAXBElement<AfficheTemperatureResponse> createAfficheTemperatureResponse(AfficheTemperatureResponse value) {
        return new JAXBElement<AfficheTemperatureResponse>(_AfficheTemperatureResponse_QNAME, AfficheTemperatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheSnow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "afficheSnow")
    public JAXBElement<AfficheSnow> createAfficheSnow(AfficheSnow value) {
        return new JAXBElement<AfficheSnow>(_AfficheSnow_QNAME, AfficheSnow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheWind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "afficheWind")
    public JAXBElement<AfficheWind> createAfficheWind(AfficheWind value) {
        return new JAXBElement<AfficheWind>(_AfficheWind_QNAME, AfficheWind.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheTemperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "afficheTemperature")
    public JAXBElement<AfficheTemperature> createAfficheTemperature(AfficheTemperature value) {
        return new JAXBElement<AfficheTemperature>(_AfficheTemperature_QNAME, AfficheTemperature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficheSnowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices/", name = "afficheSnowResponse")
    public JAXBElement<AfficheSnowResponse> createAfficheSnowResponse(AfficheSnowResponse value) {
        return new JAXBElement<AfficheSnowResponse>(_AfficheSnowResponse_QNAME, AfficheSnowResponse.class, null, value);
    }

}
