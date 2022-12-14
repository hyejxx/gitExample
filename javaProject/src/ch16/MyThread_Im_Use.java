package ch16; //문제2

public class MyThread_Im_Use {
	public static void main(String[] args) {
		MyThread_Im m1 = new MyThread_Im("스레드1");
		MyThread_Im m2 = new MyThread_Im("스레드2");
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t2.start();
		t1.start();

	}

}
