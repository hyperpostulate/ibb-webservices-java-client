
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
 *         &lt;element name="GetKaraKutuSeferBilgileri_XMLResult" minOccurs="0">
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
    "getKaraKutuSeferBilgileriXMLResult"
})
@XmlRootElement(name = "GetKaraKutuSeferBilgileri_XMLResponse")
public class GetKaraKutuSeferBilgileriXMLResponse {

    @XmlElement(name = "GetKaraKutuSeferBilgileri_XMLResult")
    protected GetKaraKutuSeferBilgileriXMLResponse.GetKaraKutuSeferBilgileriXMLResult getKaraKutuSeferBilgileriXMLResult;

    /**
     * Gets the value of the getKaraKutuSeferBilgileriXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetKaraKutuSeferBilgileriXMLResponse.GetKaraKutuSeferBilgileriXMLResult }
     *     
     */
    public GetKaraKutuSeferBilgileriXMLResponse.GetKaraKutuSeferBilgileriXMLResult getGetKaraKutuSeferBilgileriXMLResult() {
        return getKaraKutuSeferBilgileriXMLResult;
    }

    /**
     * Sets the value of the getKaraKutuSeferBilgileriXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKaraKutuSeferBilgileriXMLResponse.GetKaraKutuSeferBilgileriXMLResult }
     *     
     */
    public void setGetKaraKutuSeferBilgileriXMLResult(GetKaraKutuSeferBilgileriXMLResponse.GetKaraKutuSeferBilgileriXMLResult value) {
        this.getKaraKutuSeferBilgileriXMLResult = value;
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
    public static class GetKaraKutuSeferBilgileriXMLResult {

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
