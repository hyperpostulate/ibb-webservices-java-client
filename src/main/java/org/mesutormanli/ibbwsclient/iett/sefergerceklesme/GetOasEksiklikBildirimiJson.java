
package org.mesutormanli.ibbwsclient.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &amp;lt;element name="Yil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Ay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="Gun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
    "yil",
    "ay",
    "gun"
})
@XmlRootElement(name = "GetOasEksiklikBildirimi_json")
public class GetOasEksiklikBildirimiJson {

    @XmlElement(name = "Yil")
    protected String yil;
    @XmlElement(name = "Ay")
    protected String ay;
    @XmlElement(name = "Gun")
    protected String gun;

    /**
     * Gets the value of the yil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYil(String value) {
        this.yil = value;
    }

    /**
     * Gets the value of the ay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAy() {
        return ay;
    }

    /**
     * Sets the value of the ay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAy(String value) {
        this.ay = value;
    }

    /**
     * Gets the value of the gun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGun() {
        return gun;
    }

    /**
     * Sets the value of the gun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGun(String value) {
        this.gun = value;
    }

}
