package ch03;

public class CastEx {

	public static void main(String[] args) {
		float f = 1.6f;
		System.out.println(f);
		
		f = 100; //자동형변환(정수100을 자동으로 float형 실수 100.0f로 변환
		System.out.println(f);
		
		f = 100.5f;
		int i = (int)f; //강제형변환
		System.out.println(i);

	}

}
