package com.training.domains;

public abstract class Insurance {
	private long policyNo;
	private String policyHolderName;
	
	
	public Insurance(long policyNo, String policyHolderName) {
		super();
		this.policyNo = policyNo;
		this.policyHolderName = policyHolderName;
	}


	public long getPolicyNo() {
		return policyNo;
	}


	public void setPolicyNo(long policyNo) {
		this.policyNo = policyNo;
	}


	public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}


	public abstract double calculatePremium(); 
}
