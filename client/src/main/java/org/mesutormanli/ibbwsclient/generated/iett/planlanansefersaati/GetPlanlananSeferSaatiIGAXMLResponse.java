
package org.mesutormanli.ibbwsclient.generated.iett.planlanansefersaati;

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
 *         &amp;lt;element name="GetPlanlananSeferSaati_IGA_XMLResult" minOccurs="0"&amp;gt;
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
    "getPlanlananSeferSaatiIGAXMLResult"
})
@XmlRootElement(name = "GetPlanlananSeferSaati_IGA_XMLResponse")
public class GetPlanlananSeferSaatiIGAXMLResponse {

    @XmlElement(name = "GetPlanlananSeferSaati_IGA_XMLResult")
    protected GetPlanlananSeferSaatiIGAXMLResponse.GetPlanlananSeferSaatiIGAXMLResult getPlanlananSeferSaatiIGAXMLResult;

    /**
     * Gets the value of the getPlanlananSeferSaatiIGAXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlanlananSeferSaatiIGAXMLResponse.GetPlanlananSeferSaatiIGAXMLResult }
     *     
     */
    public GetPlanlananSeferSaatiIGAXMLResponse.GetPlanlananSeferSaatiIGAXMLResult getGetPlanlananSeferSaatiIGAXMLResult() {
        return getPlanlananSeferSaatiIGAXMLResult;
    }

    /**
     * Sets the value of the getPlanlananSeferSaatiIGAXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlanlananSeferSaatiIGAXMLResponse.GetPlanlananSeferSaatiIGAXMLResult }
     *     
     */
    public void setGetPlanlananSeferSaatiIGAXMLResult(GetPlanlananSeferSaatiIGAXMLResponse.GetPlanlananSeferSaatiIGAXMLResult value) {
        this.getPlanlananSeferSaatiIGAXMLResult = value;
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
    public static class GetPlanlananSeferSaatiIGAXMLResult {

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
