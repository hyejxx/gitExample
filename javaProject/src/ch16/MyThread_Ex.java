package ch16; //문제1

public class MyThread_Ex extends Thread {
	public MyThread_Ex() {
		
	}
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "==>" + i);
		}
	}
}
