package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class IBAApplication {
	List<StakeHolder> holders = new ArrayList<StakeHolder>();
	
	Insurance insurance;
	
	public void registerHolders(StakeHolder holder){
		holders.add(holder);
	}
	
	
	public void updateInsuranceStatus(String status){
		notifyAllStakeHolders(holders,status);
	}
	
/*	public void receive(){
		notifyAllStakeHolders(holders);
	}
	
	public void sentForReconciliation(){
		notifyAllStakeHolders(holders);
	}
	
	public void status(){
		notifyAllStakeHolders(holders);
	}*/
	
	
	private void notifyAllStakeHolders(List<StakeHolder> holders,String insurance){
		for(StakeHolder stakeHolder : holders){
			if(insurance.equals("received"))
			stakeHolder.receive();
			else if(insurance.equals("reconciliation"))
				stakeHolder.sentForReconciliation();
			else
				stakeHolder.status();
		}
		
	}
	 

}


  //enum InsuranceStatus{RECEIVED,SENT_FOR_RECONCILIATION,STATUS};

