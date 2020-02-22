
package org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme;

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
 *         &amp;lt;element name="GetUzulsuzKartKullanim_jsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
    "getUzulsuzKartKullanimJsonResult"
})
@XmlRootElement(name = "GetUzulsuzKartKullanim_jsonResponse")
public class GetUzulsuzKartKullanimJsonResponse {

    @XmlElement(name = "GetUzulsuzKartKullanim_jsonResult")
    protected String getUzulsuzKartKullanimJsonResult;

    /**
     * Gets the value of the getUzulsuzKartKullanimJsonResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetUzulsuzKartKullanimJsonResult() {
        return getUzulsuzKartKullanimJsonResult;
    }

    /**
     * Sets the value of the getUzulsuzKartKullanimJsonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetUzulsuzKartKullanimJsonResult(String value) {
        this.getUzulsuzKartKullanimJsonResult = value;
    }

}
