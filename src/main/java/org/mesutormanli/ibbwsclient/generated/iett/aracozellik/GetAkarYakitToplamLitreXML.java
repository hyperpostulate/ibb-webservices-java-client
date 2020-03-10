
package org.mesutormanli.ibbwsclient.generated.iett.aracozellik;

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
 *         &amp;lt;element name="Yil" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="Ay" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
    "ay"
})
@XmlRootElement(name = "GetAkarYakitToplamLitre_XML")
public class GetAkarYakitToplamLitreXML {

    @XmlElement(name = "Yil")
    protected int yil;
    @XmlElement(name = "Ay")
    protected int ay;

    /**
     * Gets the value of the yil property.
     * 
     */
    public int getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     */
    public void setYil(int value) {
        this.yil = value;
    }

    /**
     * Gets the value of the ay property.
     * 
     */
    public int getAy() {
        return ay;
    }

    /**
     * Sets the value of the ay property.
     * 
     */
    public void setAy(int value) {
        this.ay = value;
    }

}
