
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
 *         &lt;element name="GetYolcuBilgilendirme_XMLResult" minOccurs="0">
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
    "getYolcuBilgilendirmeXMLResult"
})
@XmlRootElement(name = "GetYolcuBilgilendirme_XMLResponse")
public class GetYolcuBilgilendirmeXMLResponse {

    @XmlElement(name = "GetYolcuBilgilendirme_XMLResult")
    protected GetYolcuBilgilendirmeXMLResponse.GetYolcuBilgilendirmeXMLResult getYolcuBilgilendirmeXMLResult;

    /**
     * Gets the value of the getYolcuBilgilendirmeXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetYolcuBilgilendirmeXMLResponse.GetYolcuBilgilendirmeXMLResult }
     *     
     */
    public GetYolcuBilgilendirmeXMLResponse.GetYolcuBilgilendirmeXMLResult getGetYolcuBilgilendirmeXMLResult() {
        return getYolcuBilgilendirmeXMLResult;
    }

    /**
     * Sets the value of the getYolcuBilgilendirmeXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetYolcuBilgilendirmeXMLResponse.GetYolcuBilgilendirmeXMLResult }
     *     
     */
    public void setGetYolcuBilgilendirmeXMLResult(GetYolcuBilgilendirmeXMLResponse.GetYolcuBilgilendirmeXMLResult value) {
        this.getYolcuBilgilendirmeXMLResult = value;
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
    public static class GetYolcuBilgilendirmeXMLResult {

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
