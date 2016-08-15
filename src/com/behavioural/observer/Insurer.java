package com.behavioural.observer;

public class Insurer  implements StakeHolder{

	@Override
	public void receive() {
		System.out.println(" Request received for memo "+ this.getClass().getSimpleName());
		
	}

	@Override
	public void sentForReconciliation() {
		System.out.println(" Recocilation request sent  for memo "+ this.getClass().getSimpleName());
		
	}

	@Override
	public void status() {
		System.out.println(" Status received for memo "+ this.getClass().getSimpleName());
		
	}

}
