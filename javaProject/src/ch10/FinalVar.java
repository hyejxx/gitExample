package ch10;

public class FinalVar {
	//멤버변수
	final static int Max_Num = 500;
	//final static int Max_Num;
	//상수는 멤버변수(전역변수)일때 선언만 하면 에러남.
	
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		System.out.println(Max_Num);
		//Max_Num = 200; //final처리한 상수변수는 값을 수정할 수 없음
	}

}
