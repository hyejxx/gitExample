package ch04;

import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total = 0; //초기화
		int count = 0;
		Scanner scan = new Scanner(System.in);
		while(true) { //무한반복
			System.out.print("정수를 입력하세요 : ");
			int num = scan.nextInt();
			if (num < 0) //{
				break; //한줄짜리이면 {}생략가능 //}
			 total += num; //total = total + num
			 count++;
		} 
		System.out.println("평균은 " + total/count);
		scan.close();
	}

}
