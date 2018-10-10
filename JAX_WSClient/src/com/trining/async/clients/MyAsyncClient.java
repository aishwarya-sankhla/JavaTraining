package com.trining.async.clients;


import javax.xml.ws.Response;

import com.trining.ifaces.BloodDonor;
import com.trining.ifaces.GetRequestResponse;

import examples.webservices.async.DonationRequest;
import examples.webservices.async.DonationRequestServiceService;

public class MyAsyncClient {

	public static void main(String[] args) {
		
		DonationRequestServiceService req = new DonationRequestServiceService();
		DonationRequest proxy = req.getDonationRequestServicePort();
		Response resp = proxy.getRequestAsync("apos");
		
		while(!resp.isDone()){
			try{
				System.out.println("Waiting for response");
				Thread t = new Thread(){
					public void run(){
						for(int i=0;i<100;i++){
							System.out.println(i);
						}
					}
				};
				t.start();
				t.join(2000);
				GetRequestResponse reqResp = (GetRequestResponse) resp.get();
				System.out.println(reqResp.getDonorDetails());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
