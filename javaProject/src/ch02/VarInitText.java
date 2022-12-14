package ch02;

public class VarInitText {

	public static void main(String[] args) {
		//지역변수는 반드시 명시적 초기화를 해야한다.
		int index = 1;
		//int index; //int index; 만하면 변수 초기화 오류됨.
		
		index = index + 1; 
		System.out.println("index : " + index);

	}

}
