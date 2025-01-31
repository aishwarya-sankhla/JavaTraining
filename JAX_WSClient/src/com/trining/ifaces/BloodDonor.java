
package com.trining.ifaces;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bloodDonor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bloodDonor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="donorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bloodGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="donation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="mobileNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bloodDonor", propOrder = {
    "donorName",
    "bloodGroup",
    "location",
    "donation"
})
public class BloodDonor {

    protected String donorName;
    protected String bloodGroup;
    protected String location;
    protected int donation;
    @XmlAttribute(name = "mobileNumber", required = true)
    protected long mobileNumber;

    /**
     * Gets the value of the donorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonorName() {
        return donorName;
    }

    /**
     * Sets the value of the donorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonorName(String value) {
        this.donorName = value;
    }

    /**
     * Gets the value of the bloodGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /**
     * Sets the value of the bloodGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodGroup(String value) {
        this.bloodGroup = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the donation property.
     * 
     */
    public int getDonation() {
        return donation;
    }

    /**
     * Sets the value of the donation property.
     * 
     */
    public void setDonation(int value) {
        this.donation = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     */
    public long getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     */
    public void setMobileNumber(long value) {
        this.mobileNumber = value;
    }

	@Override
	public String toString() {
		return "BloodDonor [donorName=" + donorName + ", bloodGroup=" + bloodGroup + ", location=" + location
				+ ", donation=" + donation + ", mobileNumber=" + mobileNumber + "]";
	}
    
}
