package com.training.domains;
import java.util.ArrayList;
import java.util.List;

public class BoundedCollection {

	public static void display(List<? extends Insurance> insurance) {
		
	}
	public static void main(String[] args) {
		LifeInsurance l1 = new LifeInsurance(19658, "Smith" ,20);
		VehicleInsurance v1 = new VehicleInsurance(1256, "Sam", "car", 2017);
		
		List<LifeInsurance> life = new ArrayList<>();	
		life.add(l1);
		
		display(life);
		
		List<VehicleInsurance> vehi = new ArrayList<>();	
		vehi.add(v1);
		
		display(life);
		display(vehi);
	}

}
