package com.training.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SpiceJet {
	@XmlElement
	private String source;
	@XmlElement
	private String desination;
	@XmlElement
	private String flightName;
	@XmlElement
	private int noOfSeats;
	public SpiceJet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SpiceJet(String source, String desination, String flightName, int noOfSeats) {
		super();
		this.source = source;
		this.desination = desination;
		this.flightName = flightName;
		this.noOfSeats = noOfSeats;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDesination() {
		return desination;
	}
	public void setDesination(String desination) {
		this.desination = desination;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	@Override
	public String toString() {
		return "SpiceJet [source=" + source + ", desination=" + desination + ", flightName=" + flightName
				+ ", noOfSeats=" + noOfSeats + "]";
	}
	
	
}
