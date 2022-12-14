package ch02;

/*
 * 2022.11.04 국비강의
 */

// 클래스 이름은 대문자로 시작
public class HelloExam {
	//전역변수(멤버변수) : 클래스와 메소드 사이에 선언된 변수

	//메소드 이름은 소문자로 시작
	public static int sum(int n, int m) {// n = 20, m = 10
		return n+m;

	}
	
	
	public static int sum2(int n, int m) {// n = 20, m = 10
		return n/m;

	} //sum2로 오버로딩(같은이름 메소드를 다르게 지정한것)
	
	//실행되는 메인 메소드(=함수)
	public static void main(String[] args) {
		int i = 20; //지역변수 초기화(값을 저장, 변수에 할당한다.)
		int s; //지역변수 선언
		char a; //지역변수 선언
		
		s = sum(20, 10); //7줄 sum 호출, s = 30
		double s2 = sum2(30, 10); //데이터타입에 맞는 수를 넣어야함
		a = '?'; // 단문자는 작은따옴표 ''를 쓰고, 단어문자는 ""를 쓴다.
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s); //println은 줄바꿈, print는 줄안바꾸고 가로로 그대로
	}

}
