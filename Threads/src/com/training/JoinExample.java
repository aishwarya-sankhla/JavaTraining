package com.training;

import java.io.IOException;

public class JoinExample {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		System.out.println("Current:"+Thread.currentThread().getName());
		Thread thread = new Thread("child"){

			@Override
			public void run() {
				System.out.println("Current:"+Thread.currentThread().getName());
				System.out.println("Reading");
				
				try {
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Current:"+Thread.currentThread().getName());
				System.out.println("Finished Reading");
			}
			
		};
		
		thread.start();
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current:"+Thread.currentThread().getName());
		System.out.println("Main Finished");
	}

}
