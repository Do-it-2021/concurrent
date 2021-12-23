package com.concurrent.thread;

public class SimpleThread extends Thread {
	
	private int countDown = 5;
	
	private int threadNum;
	
	private static int threadCount = 0;

	public SimpleThread() {
		threadNum = ++threadCount;
		System.out.println("marking:"+threadNum);
	}
	
	public void run() {
		while(true) {
			System.out.println("Thread "+ threadNum + "(" + countDown + ")");
			if(--countDown==0) {return;}
		}
	}

	public SimpleThread(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	public SimpleThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public SimpleThread(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	public SimpleThread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	public SimpleThread(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	public SimpleThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	public SimpleThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			new SimpleThread().start();
			
			System.out.println("thread start");
		}
		
		
		
	}

}
