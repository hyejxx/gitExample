package ch03;

import java.util.Scanner;

public class CalEx3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //표준 입,출력
		System.out.print("정수a를 입력하세요 : ");
		int a = in.nextInt();
		System.out.print("정수b를 입력하세요 : ");
		int b = in.nextInt();
		in.close();
		
		System.out.printf("a + b = %d\n", a + b);
		System.out.printf("a - b = %d\n", a - b);
		System.out.printf("a * b = %d\n", a * b);
		System.out.printf("a / b = %.1f\n", (double)a / b); //double실수형을 쓸거면 %d가아닌 %f로 바꿔야 에러가안난다
		System.out.printf("a %% b = %d\n", a % b);

	}

}
