//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.11 at 01:47:12 PM CEST 
//


package edu.awieclawski.teryt.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gmina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gmina"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodG" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nazwa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kodP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gmina", namespace = "http://www.awieclawski.edu/soapserver", propOrder = {
    "kodG",
    "nazwa",
    "kodP"
})
public class Gmina {

    @XmlElement(namespace = "http://www.awieclawski.edu/soapserver", required = true)
    protected String kodG;
    @XmlElement(namespace = "http://www.awieclawski.edu/soapserver", required = true)
    protected String nazwa;
    @XmlElement(namespace = "http://www.awieclawski.edu/soapserver", required = true)
    protected String kodP;

    /**
     * Gets the value of the kodG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodG() {
        return kodG;
    }

    /**
     * Sets the value of the kodG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodG(String value) {
        this.kodG = value;
    }

    /**
     * Gets the value of the nazwa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Sets the value of the nazwa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa(String value) {
        this.nazwa = value;
    }

    /**
     * Gets the value of the kodP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodP() {
        return kodP;
    }

    /**
     * Sets the value of the kodP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodP(String value) {
        this.kodP = value;
    }

}
