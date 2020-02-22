
package org.mesutormanli.ibbwsclient.generated.iett.hatdurakguzergah;

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
 *         &amp;lt;element name="GetGuzergahLineCekmekoy_XMLResult" minOccurs="0"&amp;gt;
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
    "getGuzergahLineCekmekoyXMLResult"
})
@XmlRootElement(name = "GetGuzergahLineCekmekoy_XMLResponse")
public class GetGuzergahLineCekmekoyXMLResponse {

    @XmlElement(name = "GetGuzergahLineCekmekoy_XMLResult")
    protected GetGuzergahLineCekmekoyXMLResponse.GetGuzergahLineCekmekoyXMLResult getGuzergahLineCekmekoyXMLResult;

    /**
     * Gets the value of the getGuzergahLineCekmekoyXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetGuzergahLineCekmekoyXMLResponse.GetGuzergahLineCekmekoyXMLResult }
     *     
     */
    public GetGuzergahLineCekmekoyXMLResponse.GetGuzergahLineCekmekoyXMLResult getGetGuzergahLineCekmekoyXMLResult() {
        return getGuzergahLineCekmekoyXMLResult;
    }

    /**
     * Sets the value of the getGuzergahLineCekmekoyXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGuzergahLineCekmekoyXMLResponse.GetGuzergahLineCekmekoyXMLResult }
     *     
     */
    public void setGetGuzergahLineCekmekoyXMLResult(GetGuzergahLineCekmekoyXMLResponse.GetGuzergahLineCekmekoyXMLResult value) {
        this.getGuzergahLineCekmekoyXMLResult = value;
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
    public static class GetGuzergahLineCekmekoyXMLResult {

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
