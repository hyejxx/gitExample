package ch02;

public class TypeMismatch {

	public static void main(String[] args) {
		byte n;
		n = 127; //byte는 -127 ~ 127까지 데이터를 쓸수 있다(참고 2.자료형과 변수 pdf p14), 127보다 큰 수를 쓰고 싶으면 int(?)를 쓰면된다
		System.out.println(n);

	}

}
