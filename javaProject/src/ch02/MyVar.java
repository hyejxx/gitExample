package ch02; //문제2

public class MyVar {
	static int sum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 50;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("a + b = " + sum(a , b));
	}

}