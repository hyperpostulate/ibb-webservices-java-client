
package org.mesutormanli.ibbwsclient.generated.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &amp;lt;element name="GetUzulsuzKartKullanim_XMLResult" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;any/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
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
    "getUzulsuzKartKullanimXMLResult"
})
@XmlRootElement(name = "GetUzulsuzKartKullanim_XMLResponse")
public class GetUzulsuzKartKullanimXMLResponse {

    @XmlElement(name = "GetUzulsuzKartKullanim_XMLResult")
    protected GetUzulsuzKartKullanimXMLResponse.GetUzulsuzKartKullanimXMLResult getUzulsuzKartKullanimXMLResult;

    /**
     * Gets the value of the getUzulsuzKartKullanimXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetUzulsuzKartKullanimXMLResponse.GetUzulsuzKartKullanimXMLResult }
     *     
     */
    public GetUzulsuzKartKullanimXMLResponse.GetUzulsuzKartKullanimXMLResult getGetUzulsuzKartKullanimXMLResult() {
        return getUzulsuzKartKullanimXMLResult;
    }

    /**
     * Sets the value of the getUzulsuzKartKullanimXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUzulsuzKartKullanimXMLResponse.GetUzulsuzKartKullanimXMLResult }
     *     
     */
    public void setGetUzulsuzKartKullanimXMLResult(GetUzulsuzKartKullanimXMLResponse.GetUzulsuzKartKullanimXMLResult value) {
        this.getUzulsuzKartKullanimXMLResult = value;
    }


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
     *         &amp;lt;any/&amp;gt;
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
        "any"
    })
    public static class GetUzulsuzKartKullanimXMLResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
