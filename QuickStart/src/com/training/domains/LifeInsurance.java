package com.training.domains;

public class LifeInsurance extends Insurance {
	private int age;
	
	public LifeInsurance(long policyNo, String policyHolderName, int age) {
		super(policyNo, policyHolderName);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		double premium=0.0;
		if( this.age>=40 && this.age<50)
				premium=400;
		else if(this.age>=50 && this.age<60)
				premium=500;
		else if(this.age>=60 && this.age<70)
				premium=600;
		else
				premium=1000;
		return premium;
	}

}
