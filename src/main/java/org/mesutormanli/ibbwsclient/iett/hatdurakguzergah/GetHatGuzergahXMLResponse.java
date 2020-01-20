
package org.mesutormanli.ibbwsclient.iett.hatdurakguzergah;

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
 *         &lt;element name="GetHatGuzergah_XMLResult" minOccurs="0">
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
    "getHatGuzergahXMLResult"
})
@XmlRootElement(name = "GetHatGuzergah_XMLResponse")
public class GetHatGuzergahXMLResponse {

    @XmlElement(name = "GetHatGuzergah_XMLResult")
    protected GetHatGuzergahXMLResponse.GetHatGuzergahXMLResult getHatGuzergahXMLResult;

    /**
     * Gets the value of the getHatGuzergahXMLResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetHatGuzergahXMLResponse.GetHatGuzergahXMLResult }
     *     
     */
    public GetHatGuzergahXMLResponse.GetHatGuzergahXMLResult getGetHatGuzergahXMLResult() {
        return getHatGuzergahXMLResult;
    }

    /**
     * Sets the value of the getHatGuzergahXMLResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHatGuzergahXMLResponse.GetHatGuzergahXMLResult }
     *     
     */
    public void setGetHatGuzergahXMLResult(GetHatGuzergahXMLResponse.GetHatGuzergahXMLResult value) {
        this.getHatGuzergahXMLResult = value;
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
    public static class GetHatGuzergahXMLResult {

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
