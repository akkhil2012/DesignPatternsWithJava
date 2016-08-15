package com.behavioural.state;

import java.util.concurrent.ConcurrentHashMap;

public class AppMain {
	public static void main(String args[]) {
		MemoContext context = new MemoContext();
		context.getState().memoNotCreated();
		context.getState().memoCreated();
		context.getState().memoDownloaded();
		context.getState().memoMailSent();
	}
}
