
package org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="GetPlanlananSeferSaatiAraDurak_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPlanlananSeferSaatiAraDurakJsonResult"
})
@XmlRootElement(name = "GetPlanlananSeferSaatiAraDurak_jsonResponse")
public class GetPlanlananSeferSaatiAraDurakJsonResponse {

    @XmlElement(name = "GetPlanlananSeferSaatiAraDurak_jsonResult")
    protected String getPlanlananSeferSaatiAraDurakJsonResult;

    /**
     * Gets the value of the getPlanlananSeferSaatiAraDurakJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPlanlananSeferSaatiAraDurakJsonResult() {
        return getPlanlananSeferSaatiAraDurakJsonResult;
    }

    /**
     * Sets the value of the getPlanlananSeferSaatiAraDurakJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPlanlananSeferSaatiAraDurakJsonResult(String value) {
        this.getPlanlananSeferSaatiAraDurakJsonResult = value;
    }

}
