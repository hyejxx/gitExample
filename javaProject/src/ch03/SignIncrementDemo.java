package ch03;

public class SignIncrementDemo {

	public static void main(String[] args) {
		int plusOne = 1; //카멜표기법(낙타표기법) : 앞에는 소문자하면 뒤에는 대문자로 하는법(?)
		int minusOne = -plusOne;
		System.out.println("plusOne은 " + plusOne + "입니다.");
		System.out.println("minusOne은 " + minusOne + "입니다.");
		
		int x = 1, y = 1; //하나의 int타입 오른쪽으로 써도됨
		System.out.println("x = " + x + ", ++x = " + ++x); //연결연산자
		System.out.println("y = " + x + ", x++ = " + y++); 
		System.out.println("x = " + x + ", y = " + y);
		

	}

}
