
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
 *         &lt;element name="GetYolcuTalep_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getYolcuTalepJsonResult"
})
@XmlRootElement(name = "GetYolcuTalep_jsonResponse")
public class GetYolcuTalepJsonResponse {

    @XmlElement(name = "GetYolcuTalep_jsonResult")
    protected String getYolcuTalepJsonResult;

    /**
     * Gets the value of the getYolcuTalepJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetYolcuTalepJsonResult() {
        return getYolcuTalepJsonResult;
    }

    /**
     * Sets the value of the getYolcuTalepJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetYolcuTalepJsonResult(String value) {
        this.getYolcuTalepJsonResult = value;
    }

}
