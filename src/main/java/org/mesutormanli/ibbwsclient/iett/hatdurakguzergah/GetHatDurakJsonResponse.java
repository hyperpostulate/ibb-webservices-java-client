
package org.mesutormanli.ibbwsclient.iett.hatdurakguzergah;

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
 *         &lt;element name="GetHatDurak_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getHatDurakJsonResult"
})
@XmlRootElement(name = "GetHatDurak_jsonResponse")
public class GetHatDurakJsonResponse {

    @XmlElement(name = "GetHatDurak_jsonResult")
    protected String getHatDurakJsonResult;

    /**
     * Gets the value of the getHatDurakJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetHatDurakJsonResult() {
        return getHatDurakJsonResult;
    }

    /**
     * Sets the value of the getHatDurakJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetHatDurakJsonResult(String value) {
        this.getHatDurakJsonResult = value;
    }

}
