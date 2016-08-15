package com.behavioural.state;

public class MemoDownloadedState implements MemoState{
	
MemoContext context;
	
MemoDownloadedState(MemoContext context){
		this.context = context;
	}
	
	@Override
	public void memoNotCreated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memoCreated() {
		System.out.println("Memo Created");
		
	}

	@Override
	public void memoDownloaded() {
		System.out.println("Memo Downloaded");
		context.setState(new MemoMailSentState());
		
	}

	@Override
	public void memoMailSent() {
		// TODO Auto-generated method stub
		
	}

}
