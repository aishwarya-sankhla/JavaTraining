
package com.training.spiceJet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spiceJet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spiceJet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noOfSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spiceJet", propOrder = {
    "source",
    "desination",
    "flightName",
    "noOfSeats"
})
public class SpiceJet {

    protected String source;
    protected String desination;
    protected String flightName;
    protected int noOfSeats;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the desination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesination() {
        return desination;
    }

    /**
     * Sets the value of the desination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesination(String value) {
        this.desination = value;
    }

    /**
     * Gets the value of the flightName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightName() {
        return flightName;
    }

    /**
     * Sets the value of the flightName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightName(String value) {
        this.flightName = value;
    }

    /**
     * Gets the value of the noOfSeats property.
     * 
     */
    public int getNoOfSeats() {
        return noOfSeats;
    }

    /**
     * Sets the value of the noOfSeats property.
     * 
     */
    public void setNoOfSeats(int value) {
        this.noOfSeats = value;
    }

	@Override
	public String toString() {
		return "SpiceJet [source=" + source + ", desination=" + desination + ", flightName=" + flightName
				+ ", noOfSeats=" + noOfSeats + "]";
	}
    

}
