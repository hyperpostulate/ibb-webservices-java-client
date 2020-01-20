
package org.mesutormanli.ibbwsclient.iett.duyurular;

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
 *         &lt;element name="GetDuyurular_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDuyurularJsonResult"
})
@XmlRootElement(name = "GetDuyurular_jsonResponse")
public class GetDuyurularJsonResponse {

    @XmlElement(name = "GetDuyurular_jsonResult")
    protected String getDuyurularJsonResult;

    /**
     * Gets the value of the getDuyurularJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDuyurularJsonResult() {
        return getDuyurularJsonResult;
    }

    /**
     * Sets the value of the getDuyurularJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDuyurularJsonResult(String value) {
        this.getDuyurularJsonResult = value;
    }

}
