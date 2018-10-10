
package com.trining.clients;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dollarToRupees complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dollarToRupees">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dollarToRupees", propOrder = {
    "usd"
})
public class DollarToRupees {

    protected double usd;

    /**
     * Gets the value of the usd property.
     * 
     */
    public double getUsd() {
        return usd;
    }

    /**
     * Sets the value of the usd property.
     * 
     */
    public void setUsd(double value) {
        this.usd = value;
    }

}
