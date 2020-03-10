
package org.mesutormanli.ibbwsclient.generated.iett.aracozellik;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mesutormanli.ibbwsclient.generated.iett.aracozellik package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _AuthHeader_QNAME = new QName("http://tempuri.org/", "AuthHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mesutormanli.ibbwsclient.generated.iett.aracozellik
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAracOzellikleriIETTXMLResponse }
     * 
     */
    public GetAracOzellikleriIETTXMLResponse createGetAracOzellikleriIETTXMLResponse() {
        return new GetAracOzellikleriIETTXMLResponse();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriOHOXMLResponse }
     * 
     */
    public GetAracOzellikleriOHOXMLResponse createGetAracOzellikleriOHOXMLResponse() {
        return new GetAracOzellikleriOHOXMLResponse();
    }

    /**
     * Create an instance of {@link GetAkarYakitToplamLitreXMLResponse }
     * 
     */
    public GetAkarYakitToplamLitreXMLResponse createGetAkarYakitToplamLitreXMLResponse() {
        return new GetAkarYakitToplamLitreXMLResponse();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriIETTXML }
     * 
     */
    public GetAracOzellikleriIETTXML createGetAracOzellikleriIETTXML() {
        return new GetAracOzellikleriIETTXML();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriIETTXMLResponse.GetAracOzellikleriIETTXMLResult }
     * 
     */
    public GetAracOzellikleriIETTXMLResponse.GetAracOzellikleriIETTXMLResult createGetAracOzellikleriIETTXMLResponseGetAracOzellikleriIETTXMLResult() {
        return new GetAracOzellikleriIETTXMLResponse.GetAracOzellikleriIETTXMLResult();
    }

    /**
     * Create an instance of {@link AuthHeader }
     * 
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriIETTJson }
     * 
     */
    public GetAracOzellikleriIETTJson createGetAracOzellikleriIETTJson() {
        return new GetAracOzellikleriIETTJson();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriIETTJsonResponse }
     * 
     */
    public GetAracOzellikleriIETTJsonResponse createGetAracOzellikleriIETTJsonResponse() {
        return new GetAracOzellikleriIETTJsonResponse();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriOHOXML }
     * 
     */
    public GetAracOzellikleriOHOXML createGetAracOzellikleriOHOXML() {
        return new GetAracOzellikleriOHOXML();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriOHOXMLResponse.GetAracOzellikleriOHOXMLResult }
     * 
     */
    public GetAracOzellikleriOHOXMLResponse.GetAracOzellikleriOHOXMLResult createGetAracOzellikleriOHOXMLResponseGetAracOzellikleriOHOXMLResult() {
        return new GetAracOzellikleriOHOXMLResponse.GetAracOzellikleriOHOXMLResult();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriOHOJson }
     * 
     */
    public GetAracOzellikleriOHOJson createGetAracOzellikleriOHOJson() {
        return new GetAracOzellikleriOHOJson();
    }

    /**
     * Create an instance of {@link GetAracOzellikleriOHOJsonResponse }
     * 
     */
    public GetAracOzellikleriOHOJsonResponse createGetAracOzellikleriOHOJsonResponse() {
        return new GetAracOzellikleriOHOJsonResponse();
    }

    /**
     * Create an instance of {@link GetAkarYakitToplamLitreXML }
     * 
     */
    public GetAkarYakitToplamLitreXML createGetAkarYakitToplamLitreXML() {
        return new GetAkarYakitToplamLitreXML();
    }

    /**
     * Create an instance of {@link GetAkarYakitToplamLitreXMLResponse.GetAkarYakitToplamLitreXMLResult }
     * 
     */
    public GetAkarYakitToplamLitreXMLResponse.GetAkarYakitToplamLitreXMLResult createGetAkarYakitToplamLitreXMLResponseGetAkarYakitToplamLitreXMLResult() {
        return new GetAkarYakitToplamLitreXMLResponse.GetAkarYakitToplamLitreXMLResult();
    }

    /**
     * Create an instance of {@link GetAkarYakitToplamLitreJson }
     * 
     */
    public GetAkarYakitToplamLitreJson createGetAkarYakitToplamLitreJson() {
        return new GetAkarYakitToplamLitreJson();
    }

    /**
     * Create an instance of {@link GetAkarYakitToplamLitreJsonResponse }
     * 
     */
    public GetAkarYakitToplamLitreJsonResponse createGetAkarYakitToplamLitreJsonResponse() {
        return new GetAkarYakitToplamLitreJsonResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }

}
