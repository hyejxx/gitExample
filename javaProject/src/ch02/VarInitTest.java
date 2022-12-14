package ch02;

public class VarInitTest {
	//main + Ctrl + Space => main함수 자동 생성
	public static void main(String [] args) {
		int index = 2; //지역변수 선언
		
		index = index + 1; 
		//지역변수를 활용할때는 반드시 값을 초기화 해야한다.
		System.out.println("index : " + index);
	}

}
