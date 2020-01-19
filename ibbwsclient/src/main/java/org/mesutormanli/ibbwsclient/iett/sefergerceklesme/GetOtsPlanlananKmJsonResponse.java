
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
 *         &lt;element name="GetOtsPlanlananKm_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getOtsPlanlananKmJsonResult"
})
@XmlRootElement(name = "GetOtsPlanlananKm_jsonResponse")
public class GetOtsPlanlananKmJsonResponse {

    @XmlElement(name = "GetOtsPlanlananKm_jsonResult")
    protected String getOtsPlanlananKmJsonResult;

    /**
     * Gets the value of the getOtsPlanlananKmJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetOtsPlanlananKmJsonResult() {
        return getOtsPlanlananKmJsonResult;
    }

    /**
     * Sets the value of the getOtsPlanlananKmJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetOtsPlanlananKmJsonResult(String value) {
        this.getOtsPlanlananKmJsonResult = value;
    }

}
