package ch02;

public class VarScope {
	static int x; //전역변수, x = 0; 세팅
	
	public static void main(String[] args) {
		int y = 0;//지역변수기 때문에 0으로 초기화
		char ch1 = '\uac00'; // '가'를 나타낼수있는 utf-16 코드
		char ch2 = '나';
		
		System.out.println("x = " + x); // +는 연결연산자로서 문자열과 변수등을 연결
		System.out.println("y = " + y);
		System.out.println(ch1);
		System.out.println(ch2);
	}

}

//메모리는 주소 번지를 알아야한다. (문자열이 아닌 문자열 안에있는 주소 번지)