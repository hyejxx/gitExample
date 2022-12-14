package ch05; //문제2

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int intArray;
		int j = 0;
		int tot = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 >> ");
		intArray = sc.nextInt();
		int [] score = new int[intArray];
		
		for(int i = 0; i < score.length; i++) {
			System.out.print("성적을 입력하세요 : ");
			j = sc.nextInt();
			score[i] += j;
			tot += score[i];
		}
		sc.close();
		
		System.out.println("===================");
		System.out.println("총점은 "+tot+ "점 입니다.");
		System.out.println("평균은 "+(double)tot/score.length+ "점 입니다.");
	}

}
