
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
 *         &lt;element name="GetDurakBeyoglu_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getDurakBeyogluJsonResult"
})
@XmlRootElement(name = "GetDurakBeyoglu_jsonResponse")
public class GetDurakBeyogluJsonResponse {

    @XmlElement(name = "GetDurakBeyoglu_jsonResult")
    protected String getDurakBeyogluJsonResult;

    /**
     * Gets the value of the getDurakBeyogluJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetDurakBeyogluJsonResult() {
        return getDurakBeyogluJsonResult;
    }

    /**
     * Sets the value of the getDurakBeyogluJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetDurakBeyogluJsonResult(String value) {
        this.getDurakBeyogluJsonResult = value;
    }

}
