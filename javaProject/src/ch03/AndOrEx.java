package ch03;

public class AndOrEx {
//논리연산자 &&, ||
	public static void main(String[] args) {
		int a = 7;
		System.out.println(a > 5 && a < 0); //&& 논리곱, true && false => false(하나라도 false나오면 다 false)
		System.out.println(a > 5 || a < 0); //||는 하나만 true 이면 다 true이다.
	}

}
