
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
 *         &amp;lt;element name="GetPlanlananSeferSaatiAraDurak_XMLResult" minOccurs="0"&amp;gt;
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
    "getPlanlananSeferSaatiAraDurakXMLResult"
})
@XmlRootElement(name = "GetPlanlananSeferSaatiAraDurak_XMLResponse")
public class GetPlanlananSeferSaatiAraDurakXMLResponse {

    @XmlElement(name = "GetPlanlananSeferSaatiAraDurak_XMLResult")
    protected GetPlanlananSeferSaatiAraDurakXMLResponse.GetPlanlananSeferSaatiAraDurakXMLResult getPlanlananSeferSaatiAraDurakXMLResult;

    /**
     * Gets the value of the getPlanlananSeferSaatiAraDurakXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPlanlananSeferSaatiAraDurakXMLResponse.GetPlanlananSeferSaatiAraDurakXMLResult }
     *     
     */
    public GetPlanlananSeferSaatiAraDurakXMLResponse.GetPlanlananSeferSaatiAraDurakXMLResult getGetPlanlananSeferSaatiAraDurakXMLResult() {
        return getPlanlananSeferSaatiAraDurakXMLResult;
    }

    /**
     * Sets the value of the getPlanlananSeferSaatiAraDurakXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPlanlananSeferSaatiAraDurakXMLResponse.GetPlanlananSeferSaatiAraDurakXMLResult }
     *     
     */
    public void setGetPlanlananSeferSaatiAraDurakXMLResult(GetPlanlananSeferSaatiAraDurakXMLResponse.GetPlanlananSeferSaatiAraDurakXMLResult value) {
        this.getPlanlananSeferSaatiAraDurakXMLResult = value;
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
    public static class GetPlanlananSeferSaatiAraDurakXMLResult {

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
