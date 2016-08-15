package com.behavioural.state;

public class MemoContext {
	
	MemoState state;
	
	MemoContext(){
		state = new MemoNotCreatedState(this);
	}

	public MemoState getState() {
		return this.state;
	}

	public void setState(MemoState state) {
		this.state = state;
	}
	
	

}
