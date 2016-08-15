package com.behavioural.state;

public class MemoCreatedState implements MemoState {
	
MemoContext context;
	
	MemoCreatedState(MemoContext context){
		this.context = context;
	}
	
	@Override
	public void memoNotCreated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memoCreated() {
		System.out.println("Memo Created");
		context.setState(new MemoDownloadedState(context));
		
	}

	@Override
	public void memoDownloaded() {
		System.out.println("Memo Created Just Now");
		
	}

	@Override
	public void memoMailSent() {
		System.out.println("Memo Mail yet to sent");
		
	}

}
