package ch16; //문제2

public class MyThread_Im implements Runnable {
	String thread;
	public MyThread_Im(String thread) {
		this.thread = thread;
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(thread + "==>" + i);
		}
		
	}

}
