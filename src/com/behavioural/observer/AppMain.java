package com.behavioural.observer;

public class AppMain {
	
	static IBAApplication ibaApplication = new IBAApplication();
	
	public static void main(String args[]) {
		
		StakeHolder holder = new Insurer();
		 
		
		//ibaApplication.registerHolders(holder);
		ibaApplication.registerHolders(new Broker());
		ibaApplication.registerHolders(new Insurer());
		ibaApplication.registerHolders(new Insuree());
		
		Insurance insurance = new Insurance();
		
		insurance.setStatus("received");
		ibaApplication.updateInsuranceStatus(insurance.getStatus());
		
		
		insurance.setStatus("reconciliation");
		ibaApplication.updateInsuranceStatus(insurance.getStatus());
		
		insurance.setStatus("status");
		ibaApplication.updateInsuranceStatus(insurance.getStatus());
		
	}

}
