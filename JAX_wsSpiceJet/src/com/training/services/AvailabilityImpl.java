package com.training.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.training.domain.SpiceJet;
import com.training.ifaces.Availability;

@WebService(endpointInterface="com.training.ifaces.Availability")
public class AvailabilityImpl implements Availability {
	private List<SpiceJet> flightList;
	
	
	public AvailabilityImpl() {
		super();
		flightList = new ArrayList<>();
		flightList.add(new SpiceJet("Delhi", "Bangalore", "BoeingSp", 2));
		flightList.add(new SpiceJet("Bangalore", "Hyderabad", "Boeing12", 54));
		flightList.add(new SpiceJet("Hyderabad", "Bangalore", "Boeing32", 45));
		flightList.add(new SpiceJet("Delhi", "Hyderabad", "Boeing90", 6));
		flightList.add(new SpiceJet("Bangalore", "Delhi", "Boeing23", 12));
	}


	@Override
	public List<SpiceJet> checkAvailablity(String source, String destination) {
		List<SpiceJet> spiceList = new ArrayList<>();
		for(SpiceJet s:flightList){
			if(s.getSource().equals(source) && s.getDesination().equals(destination))
				spiceList.add(s);
		}
		return spiceList;
	}

}
