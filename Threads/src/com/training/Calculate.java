package com.training;

public class Calculate implements Runnable {

	private int count;
	
	public Calculate(int count) {
		super();
		this.count = count;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		long fact=1;
		for(int i=count;i>0;i--){
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Calculate fiveFact = new Calculate(5);
		
		Thread thread = new Thread(fiveFact);
		thread.setName("Five Factorial");
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Calculate fourFact = new Calculate(4);
		
		Thread thread2 = new Thread(fourFact,"Four Factorial");
		thread2.start();
	}
}

