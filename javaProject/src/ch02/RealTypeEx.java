package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d = 0.1234d; //d 생략 가능
		double e = 1234E-4; //1234E-4 = 1234 * 10의 -4승 이므로 0.1234와 동일
		float f = 0.1234f; // float형 만큼은 숫자 뒤에 f 또는 F를 꼭 명시해야 한다. 얘는 생략x
		double w = .1234D; //.1234는 0.1234이다. 0. 생략 가능
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);

	}

}
