
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
 *         &lt;element name="GetFiloAracKonum_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getFiloAracKonumJsonResult"
})
@XmlRootElement(name = "GetFiloAracKonum_jsonResponse")
public class GetFiloAracKonumJsonResponse {

    @XmlElement(name = "GetFiloAracKonum_jsonResult")
    protected String getFiloAracKonumJsonResult;

    /**
     * Gets the value of the getFiloAracKonumJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetFiloAracKonumJsonResult() {
        return getFiloAracKonumJsonResult;
    }

    /**
     * Sets the value of the getFiloAracKonumJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetFiloAracKonumJsonResult(String value) {
        this.getFiloAracKonumJsonResult = value;
    }

}
