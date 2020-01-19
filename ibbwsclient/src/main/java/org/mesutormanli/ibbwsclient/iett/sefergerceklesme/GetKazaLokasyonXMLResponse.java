
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
 *         &lt;element name="GetKazaLokasyon_XMLResult" minOccurs="0">
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
    "getKazaLokasyonXMLResult"
})
@XmlRootElement(name = "GetKazaLokasyon_XMLResponse")
public class GetKazaLokasyonXMLResponse {

    @XmlElement(name = "GetKazaLokasyon_XMLResult")
    protected GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult getKazaLokasyonXMLResult;

    /**
     * Gets the value of the getKazaLokasyonXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult }
     *     
     */
    public GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult getGetKazaLokasyonXMLResult() {
        return getKazaLokasyonXMLResult;
    }

    /**
     * Sets the value of the getKazaLokasyonXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult }
     *     
     */
    public void setGetKazaLokasyonXMLResult(GetKazaLokasyonXMLResponse.GetKazaLokasyonXMLResult value) {
        this.getKazaLokasyonXMLResult = value;
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
    public static class GetKazaLokasyonXMLResult {

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
