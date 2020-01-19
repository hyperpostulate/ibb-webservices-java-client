
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
 *         &lt;element name="GetOasKazaBilgisi_XMLResult" minOccurs="0">
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
    "getOasKazaBilgisiXMLResult"
})
@XmlRootElement(name = "GetOasKazaBilgisi_XMLResponse")
public class GetOasKazaBilgisiXMLResponse {

    @XmlElement(name = "GetOasKazaBilgisi_XMLResult")
    protected GetOasKazaBilgisiXMLResponse.GetOasKazaBilgisiXMLResult getOasKazaBilgisiXMLResult;

    /**
     * Gets the value of the getOasKazaBilgisiXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetOasKazaBilgisiXMLResponse.GetOasKazaBilgisiXMLResult }
     *     
     */
    public GetOasKazaBilgisiXMLResponse.GetOasKazaBilgisiXMLResult getGetOasKazaBilgisiXMLResult() {
        return getOasKazaBilgisiXMLResult;
    }

    /**
     * Sets the value of the getOasKazaBilgisiXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetOasKazaBilgisiXMLResponse.GetOasKazaBilgisiXMLResult }
     *     
     */
    public void setGetOasKazaBilgisiXMLResult(GetOasKazaBilgisiXMLResponse.GetOasKazaBilgisiXMLResult value) {
        this.getOasKazaBilgisiXMLResult = value;
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
    public static class GetOasKazaBilgisiXMLResult {

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
