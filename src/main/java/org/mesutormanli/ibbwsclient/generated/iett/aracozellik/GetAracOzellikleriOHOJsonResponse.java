
package org.mesutormanli.ibbwsclient.generated.iett.aracozellik;

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
 *         &amp;lt;element name="GetAracOzellikleriOHO_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
    "getAracOzellikleriOHOJsonResult"
})
@XmlRootElement(name = "GetAracOzellikleriOHO_jsonResponse")
public class GetAracOzellikleriOHOJsonResponse {

    @XmlElement(name = "GetAracOzellikleriOHO_jsonResult")
    protected String getAracOzellikleriOHOJsonResult;

    /**
     * Gets the value of the getAracOzellikleriOHOJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetAracOzellikleriOHOJsonResult() {
        return getAracOzellikleriOHOJsonResult;
    }

    /**
     * Sets the value of the getAracOzellikleriOHOJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetAracOzellikleriOHOJsonResult(String value) {
        this.getAracOzellikleriOHOJsonResult = value;
    }

}
