package ch04;

import java.util.Scanner;

public class Do_While_Random {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		answer = (int)(Math.random()*10)+1;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("1과 10사이의 정수를 입력하세요 > ");
			String tmp = scanner.next();
			input = Integer.parseInt(tmp); //parseInt : 문자형을 숫자형으로 변환(이런일들이 종종 많다)
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰수로 다시 시도해보세요.");
			}
			
		} while(input != answer);
		scanner.close();
		System.out.println("정답입니다.");

	}

}
