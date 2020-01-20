
package org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetKaraKutuSeferBilgileri_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getKaraKutuSeferBilgileriJsonResult"
})
@XmlRootElement(name = "GetKaraKutuSeferBilgileri_jsonResponse")
public class GetKaraKutuSeferBilgileriJsonResponse {

    @XmlElement(name = "GetKaraKutuSeferBilgileri_jsonResult")
    protected String getKaraKutuSeferBilgileriJsonResult;

    /**
     * Gets the value of the getKaraKutuSeferBilgileriJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetKaraKutuSeferBilgileriJsonResult() {
        return getKaraKutuSeferBilgileriJsonResult;
    }

    /**
     * Sets the value of the getKaraKutuSeferBilgileriJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetKaraKutuSeferBilgileriJsonResult(String value) {
        this.getKaraKutuSeferBilgileriJsonResult = value;
    }

}
