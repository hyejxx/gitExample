package ch16; //문제1

public class MyThread_Ex_Use {
	public static void main(String[] args) {
		MyThread_Ex e1 = new MyThread_Ex();
		MyThread_Ex e2 = new MyThread_Ex();
		
		e1.setName("스레드1");
		e2.setName("스레드2");
		
		e1.setPriority(Thread.MAX_PRIORITY);
		e2.setPriority(Thread.MIN_PRIORITY);
		
		e1.start();
		e2.start();

	}

}
