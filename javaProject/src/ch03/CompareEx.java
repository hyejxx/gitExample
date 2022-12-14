package ch03;

public class CompareEx {

	public static void main(String[] args) {
		int a = 65;
		char c = 'A'; //character 타입
		System.out.println(a == c); //비교연산자(Equal)
		System.out.println(a = c); //대입연산자, ==는 같은 의미 =는 대입 의미
		System.out.println('A' != 65); //not Equal, 아스키코드 A는 65이다. 그래서 != 할때 false나온거다

	}

}
