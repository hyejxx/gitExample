package ch03;

public class CastEx2 {

	public static void main(String[] args) {
		int a = 500;
		float b = 200.2f;
		int c = 127;
		double d = a; //자동형변환
		System.out.println("int a => double : " + d);
		
		int e = (int)b; //정수형보다 실수형이 더 크다, 강제형변환
		System.out.println("float b => int : " + e);
		
		byte f = (byte)c; //int가 byte보다 크다, 강제형변환
		System.out.println("int c => byte : " + f);
	}

}
