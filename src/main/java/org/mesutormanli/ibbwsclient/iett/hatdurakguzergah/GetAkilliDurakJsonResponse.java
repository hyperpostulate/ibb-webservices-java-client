
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
 *         &lt;element name="GetAkilliDurak_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getAkilliDurakJsonResult"
})
@XmlRootElement(name = "GetAkilliDurak_jsonResponse")
public class GetAkilliDurakJsonResponse {

    @XmlElement(name = "GetAkilliDurak_jsonResult")
    protected String getAkilliDurakJsonResult;

    /**
     * Gets the value of the getAkilliDurakJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAkilliDurakJsonResult() {
        return getAkilliDurakJsonResult;
    }

    /**
     * Sets the value of the getAkilliDurakJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAkilliDurakJsonResult(String value) {
        this.getAkilliDurakJsonResult = value;
    }

}
