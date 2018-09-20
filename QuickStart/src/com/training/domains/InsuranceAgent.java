package com.training.domains;

public class InsuranceAgent {

	//Parameter Passing -> instead SuperType of SubclassType
	public static void findPremium(Insurance insurance){
		System.out.println(insurance.calculatePremium());
	}
	public static void main(String[] args) {
		VehicleInsurance pulsar=new VehicleInsurance(32569, "John", "bike", 2016);
	
		findPremium(pulsar);
		
		//superclasstype = subclasstype
		Insurance maruti = new VehicleInsurance(23333, "Smith", "car", 2017);
		
		findPremium(maruti);
		
		Insurance life = new LifeInsurance(1558, "Sam", 40);
		findPremium(life);

	}

}
