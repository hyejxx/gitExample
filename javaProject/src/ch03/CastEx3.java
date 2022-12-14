package ch03;

public class CastEx3 {

	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		System.out.println("x / y = " + x / y);
		//System.out.printf("x / y = %.1f", x / y); //printf를쓸때는 %d가 아닌 .1f로 하는게 좋다
		System.out.printf("x / y = %.1f", (double)x / y);
		//printf에서는 결과값에 따른 실수형 포맷등을 잘 써야 한다.

	}

}
