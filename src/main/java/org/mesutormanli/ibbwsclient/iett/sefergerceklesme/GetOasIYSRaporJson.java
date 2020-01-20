
package org.mesutormanli.ibbwsclient.iett.sefergerceklesme;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="Yil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "yil",
    "ay",
    "gun"
})
@XmlRootElement(name = "GetOasIYSRapor_json")
public class GetOasIYSRaporJson {

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
