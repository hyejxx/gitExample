package ch02;

public class Interpret {

	public static void main(String[] args) {
		//로컬변수(지역변수) : 반드시 초기화가 되어야만 한다.
		int a; //컴퓨터는 한줄한줄 차례대로 읽고 기억한다.
		int b;
		int tot;
		// tot = a + b; //interpret : 순차적으로 진행한다는것, 변수에 값이 할당되지 않은 상태에서 연산을 하면 에러가 난다.
		// (순차적 인터프러트 방식이기 때문, 논리적인 순서도 있다.)
		
		a = 1;
		b = 2;
		tot = a + b;  //이 부분에 적어야됨.
		System.out.println(tot);

	}

}
