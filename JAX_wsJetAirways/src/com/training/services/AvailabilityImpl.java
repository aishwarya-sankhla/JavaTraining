package com.training.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.training.domain.JetAirways;
import com.training.ifaces.Availability;

@WebService(endpointInterface="com.training.ifaces.Availability")
public class AvailabilityImpl implements Availability{
	private List<JetAirways> flightList;
	public AvailabilityImpl() {
		super();
		flightList = new ArrayList<>();
		flightList.add(new JetAirways("Bangalore", "Hyderabad", "Boeing12", 54));
		flightList.add(new JetAirways("Hyderabad", "Bangalore", "Boeing32", 45));
		flightList.add(new JetAirways("Delhi", "Hyderabad", "Boeing90", 6));
		flightList.add(new JetAirways("Bangalore", "Delhi", "Boeing23", 12));
	}

	@Override
	public List<JetAirways> checkAvailablity(String source, String destination) {
		List<JetAirways> jetList = new ArrayList<>();
		for(JetAirways j:flightList){
			if(j.getSource().equals(source) && j.getDesination().equals(destination))
				jetList.add(j);
		}
		return jetList;
	}

}
