package com.wl.test;

public class Main {
//sdfsdfsdf1212
	public static void main(String[] args)  throws Exception{
		Object lock = new Object();
		
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					Thread.sleep(4000);
					synchronized (lock) {
					
					lock.notify();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		},"t1");
	    t1.start();
		
		
		synchronized (lock) {
			
			try {
				lock.wait();
				System.out.println("唤醒");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
	}
	
	

}
