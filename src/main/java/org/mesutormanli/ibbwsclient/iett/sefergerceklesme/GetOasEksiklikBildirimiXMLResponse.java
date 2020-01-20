
package org.mesutormanli.ibbwsclient.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
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
 *         &lt;element name="GetOasEksiklikBildirimi_XMLResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "getOasEksiklikBildirimiXMLResult"
})
@XmlRootElement(name = "GetOasEksiklikBildirimi_XMLResponse")
public class GetOasEksiklikBildirimiXMLResponse {

    @XmlElement(name = "GetOasEksiklikBildirimi_XMLResult")
    protected GetOasEksiklikBildirimiXMLResponse.GetOasEksiklikBildirimiXMLResult getOasEksiklikBildirimiXMLResult;

    /**
     * Gets the value of the getOasEksiklikBildirimiXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetOasEksiklikBildirimiXMLResponse.GetOasEksiklikBildirimiXMLResult }
     *     
     */
    public GetOasEksiklikBildirimiXMLResponse.GetOasEksiklikBildirimiXMLResult getGetOasEksiklikBildirimiXMLResult() {
        return getOasEksiklikBildirimiXMLResult;
    }

    /**
     * Sets the value of the getOasEksiklikBildirimiXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOasEksiklikBildirimiXMLResponse.GetOasEksiklikBildirimiXMLResult }
     *     
     */
    public void setGetOasEksiklikBildirimiXMLResult(GetOasEksiklikBildirimiXMLResponse.GetOasEksiklikBildirimiXMLResult value) {
        this.getOasEksiklikBildirimiXMLResult = value;
    }


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
     *         &lt;any/>
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
        "any"
    })
    public static class GetOasEksiklikBildirimiXMLResult {

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
