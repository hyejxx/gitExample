package ch01;

import java.util.Scanner;

public class Pratice2 { //프로그래밍 언어응용(문제해결시나리오)
	public void sum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		if(num >= 0) { //num > 0 
			int i = 1;
			while(i <= num) {
				sum += i;
				//i++;
			}
			System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
		} else {
			System.out.println("숫자가 1이상이 아닙니다.");
		}
	}
}

//원인
//13행 : 범위에 0이 함께 포함되어 있음
//16행 : i에 대한 증감문이 없음

//해결방안(조치내용)
//13행 : num > 0으로 수정
//16행 : 아래에 i++; 추가