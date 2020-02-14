
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
 *         &amp;lt;element name="GetPlanlananSeferSaati_IGA_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
    "getPlanlananSeferSaatiIGAJsonResult"
})
@XmlRootElement(name = "GetPlanlananSeferSaati_IGA_jsonResponse")
public class GetPlanlananSeferSaatiIGAJsonResponse {

    @XmlElement(name = "GetPlanlananSeferSaati_IGA_jsonResult")
    protected String getPlanlananSeferSaatiIGAJsonResult;

    /**
     * Gets the value of the getPlanlananSeferSaatiIGAJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPlanlananSeferSaatiIGAJsonResult() {
        return getPlanlananSeferSaatiIGAJsonResult;
    }

    /**
     * Sets the value of the getPlanlananSeferSaatiIGAJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPlanlananSeferSaatiIGAJsonResult(String value) {
        this.getPlanlananSeferSaatiIGAJsonResult = value;
    }

}
