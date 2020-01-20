
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
 *         &lt;element name="GetGuzergahDurak_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getGuzergahDurakJsonResult"
})
@XmlRootElement(name = "GetGuzergahDurak_jsonResponse")
public class GetGuzergahDurakJsonResponse {

    @XmlElement(name = "GetGuzergahDurak_jsonResult")
    protected String getGuzergahDurakJsonResult;

    /**
     * Gets the value of the getGuzergahDurakJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetGuzergahDurakJsonResult() {
        return getGuzergahDurakJsonResult;
    }

    /**
     * Sets the value of the getGuzergahDurakJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetGuzergahDurakJsonResult(String value) {
        this.getGuzergahDurakJsonResult = value;
    }

}
