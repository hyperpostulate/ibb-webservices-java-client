
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
 *         &lt;element name="GetKaraKutu_ServiseHazirAracMetrobus_XMLResult" minOccurs="0">
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
    "getKaraKutuServiseHazirAracMetrobusXMLResult"
})
@XmlRootElement(name = "GetKaraKutu_ServiseHazirAracMetrobus_XMLResponse")
public class GetKaraKutuServiseHazirAracMetrobusXMLResponse {

    @XmlElement(name = "GetKaraKutu_ServiseHazirAracMetrobus_XMLResult")
    protected GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult getKaraKutuServiseHazirAracMetrobusXMLResult;

    /**
     * Gets the value of the getKaraKutuServiseHazirAracMetrobusXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult }
     *     
     */
    public GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult getGetKaraKutuServiseHazirAracMetrobusXMLResult() {
        return getKaraKutuServiseHazirAracMetrobusXMLResult;
    }

    /**
     * Sets the value of the getKaraKutuServiseHazirAracMetrobusXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult }
     *     
     */
    public void setGetKaraKutuServiseHazirAracMetrobusXMLResult(GetKaraKutuServiseHazirAracMetrobusXMLResponse.GetKaraKutuServiseHazirAracMetrobusXMLResult value) {
        this.getKaraKutuServiseHazirAracMetrobusXMLResult = value;
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
    public static class GetKaraKutuServiseHazirAracMetrobusXMLResult {

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
