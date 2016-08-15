package com.behavioural.state;

public class MemoNotCreatedState implements MemoState
{
	MemoContext context;
	
	MemoNotCreatedState(MemoContext context){
		this.context = context;
	}

	@Override
	public void memoNotCreated() {
		System.out.println("Memo NOT Created YEt");
		context.setState(new MemoDownloadedState(context));
		
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
		// TODO Auto-generated method stub
		
	}

}
