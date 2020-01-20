
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
 *         &lt;element name="GetYolcuBilgilendirme_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getYolcuBilgilendirmeJsonResult"
})
@XmlRootElement(name = "GetYolcuBilgilendirme_jsonResponse")
public class GetYolcuBilgilendirmeJsonResponse {

    @XmlElement(name = "GetYolcuBilgilendirme_jsonResult")
    protected String getYolcuBilgilendirmeJsonResult;

    /**
     * Gets the value of the getYolcuBilgilendirmeJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetYolcuBilgilendirmeJsonResult() {
        return getYolcuBilgilendirmeJsonResult;
    }

    /**
     * Sets the value of the getYolcuBilgilendirmeJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetYolcuBilgilendirmeJsonResult(String value) {
        this.getYolcuBilgilendirmeJsonResult = value;
    }

}
