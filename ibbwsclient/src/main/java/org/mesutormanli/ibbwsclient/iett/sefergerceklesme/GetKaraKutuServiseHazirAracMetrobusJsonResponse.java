
package org.mesutormanli.ibbwsclient.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetKaraKutu_ServiseHazirAracMetrobus_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getKaraKutuServiseHazirAracMetrobusJsonResult"
})
@XmlRootElement(name = "GetKaraKutu_ServiseHazirAracMetrobus_jsonResponse")
public class GetKaraKutuServiseHazirAracMetrobusJsonResponse {

    @XmlElement(name = "GetKaraKutu_ServiseHazirAracMetrobus_jsonResult")
    protected String getKaraKutuServiseHazirAracMetrobusJsonResult;

    /**
     * Gets the value of the getKaraKutuServiseHazirAracMetrobusJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetKaraKutuServiseHazirAracMetrobusJsonResult() {
        return getKaraKutuServiseHazirAracMetrobusJsonResult;
    }

    /**
     * Sets the value of the getKaraKutuServiseHazirAracMetrobusJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetKaraKutuServiseHazirAracMetrobusJsonResult(String value) {
        this.getKaraKutuServiseHazirAracMetrobusJsonResult = value;
    }

}
