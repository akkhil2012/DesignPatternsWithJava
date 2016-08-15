package com.behavioural.state;

public class MemoMailSentState implements MemoState{

	@Override
	public void memoNotCreated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memoCreated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memoDownloaded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memoMailSent() {
		System.out.println("Memo Mail Sent");
		
	}
}
